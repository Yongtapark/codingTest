import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        int[] myCard = new int[N];
        HashSet<Integer> integers = new HashSet<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            myCard[i] = Integer.parseInt(st.nextToken());
            integers.add(myCard[i]);
        }

        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        int[][] cards = new int[M][1];
        for(int i=0;i<M;i++){
            if(!integers.add(Integer.parseInt(st.nextToken()))){
                cards[i][0]=1;
            }
        }

        for(int i=0; i<M;i++){
            bw.write(cards[i][0]+" ");
        }



        bw.flush();
    }
}
