import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        HashSet<String> noOneHeardSet = new HashSet<>();
        for(int i=0;i<N;i++){
            String noOneHeard = br.readLine();
            noOneHeardSet.add(noOneHeard);
        }

        ArrayList<String> noOneHeardAndSeenList = new ArrayList<>();
        for(int i=0;i<M;i++){
            String noOneSeen = br.readLine();
            if (noOneHeardSet.contains(noOneSeen)){
                noOneHeardAndSeenList.add(noOneSeen);
            }
        }
        Collections.sort(noOneHeardAndSeenList);

        StringBuilder answer = new StringBuilder();
        answer.append(noOneHeardAndSeenList.size()).append("\n");
        for(int i=0;i<noOneHeardAndSeenList.size();i++){
            answer.append(noOneHeardAndSeenList.get(i)).append("\n");
        }

        bw.write(answer.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}
