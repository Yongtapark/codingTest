import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        final String FACTOR = "factor";
        final String MULTIPLE = "multiple";
        final String NEITHER = "neither";

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int first = -1;
        int second = -1;

        for (; ; ) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            first = Integer.parseInt(st.nextToken());
            second = Integer.parseInt(st.nextToken());
            
            if (first == 0 && second == 0) {
                break;
            }

            if (first == 0) {
                bw.write(MULTIPLE + "\n");
            } else if (second == 0) {
                bw.write(NEITHER + "\n");
            }

            else {
                if (first % second == 0) {
                    bw.write(MULTIPLE + "\n");
                } else if (second % first == 0) {
                    bw.write(FACTOR + "\n");
                } else {
                    bw.write(NEITHER + "\n");
                }
            }
        }

        bw.flush();
    }
}