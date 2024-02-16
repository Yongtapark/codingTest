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
        st = new StringTokenizer(br.readLine());
        int answer= 0;
        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(st.nextToken());
            int count = 0;
            for (int j = 1; j < num + 1; j++) {
                if (num % j == 0 && num > 1) {
                    count++;
                }
            }
            if (count == 2) {
               answer++;
            }
        }
        bw.write(answer + "\n");
        bw.flush();


    }
}