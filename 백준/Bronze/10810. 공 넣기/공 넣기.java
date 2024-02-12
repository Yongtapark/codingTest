import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] unparsedCount = bf.readLine().split(" ");
        int N = Integer.parseInt(unparsedCount[0]);
        int M = Integer.parseInt(unparsedCount[1]);

        int[] basket = new int[N];
        int start, end, ballNum;
        for(int i=0;i<M;i++){
            String[] unparsedNum = bf.readLine().split(" ");
            start = Integer.parseInt(unparsedNum[0]);
            end = Integer.parseInt(unparsedNum[1]);
            ballNum = Integer.parseInt(unparsedNum[2]);
            for(int j=start-1;j<end;j++){
                basket[j] = ballNum;
            }
        }
        for (int i=0;i<N;i++){
            bw.write(basket[i]+" ");
            bw.flush();
        }


    }
}