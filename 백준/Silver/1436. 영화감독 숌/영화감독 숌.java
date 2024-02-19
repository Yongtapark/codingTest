import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int count = 0;
        for (long i = 0; ; i++) {
            String intToString = String.valueOf(i);
            if (intToString.contains("666")) {
                count++;
            }
            if (count == N) {
                System.out.println(i);
                break;
            }
        }
    }
}
