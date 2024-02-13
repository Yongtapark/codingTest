import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] numbers = new int[N+1];

        for(int i=1;i<numbers.length;i++){
            numbers[i]=i;
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int from = Integer.parseInt(st.nextToken());
            int to = Integer.parseInt(st.nextToken());

            for(int j=0;j<to-from-j;j++){

                int tmp = numbers[from+j];
                numbers[from+j] = numbers[to-j];
                numbers[to-j] = tmp;

            }

        }
        for(int k=1;k<numbers.length;k++){
            bw.write(numbers[k]+" ");
        }
        bw.write("\n");
        bw.flush();
    }
}