import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.HashMap;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        int[] myCard = new int[N];
        int[] sortedMyCard = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0;i<N;i++){
            myCard[i] = Integer.parseInt(st.nextToken());
            sortedMyCard[i] = myCard[i];
        }
        Arrays.sort(sortedMyCard);



        HashMap<Integer, Integer> hashMap = new HashMap<>();
        int count =0;
        for(int i=0;i<sortedMyCard.length;i++){
            if(!hashMap.containsKey(sortedMyCard[i])){
                hashMap.put(sortedMyCard[i],count++);
            }
        }

        for(int i=0;i<N;i++){
            bw.write(hashMap.get(myCard[i])+" ");
        }

        bw.flush();
    }
}
