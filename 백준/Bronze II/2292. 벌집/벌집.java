import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        int origin = 1;
        int count = 1;

        if (N == 1) {
            bw.write(count+ "\n");
        } else {
            while (N > origin) {
                origin += 6 * count;
                count++;
            }
            bw.write(count + "\n");
        }
        bw.flush();
    }
}