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
        int depth = 0;
        int sum = 0;
        for (int i = 0; i < N + 1; i++) {
            sum += i;
            depth = i;
            if (N <= sum) {
                break;
            }
        }

        int calculate = sum - N;
        int son = 0;
        int mom = 0;
        for (int i = 0; i < calculate + 1; i++) {
            if (depth % 2 != 0) {
                son = 1 + i;
                mom = depth - i;
                if (calculate == 0) {
                    son = 1;
                    mom = depth;
                }
            } else {
                son = depth - i;
                mom = 1 + i;
                if (calculate == 0) {
                    son = depth;
                    mom = 1;
                }
            }
        }

        bw.write(son + "/" + mom + "\n");

        bw.flush();
    }
}