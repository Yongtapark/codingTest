import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = Integer.parseInt(br.readLine());
        String answer = "";
        for (int i = 0; i < count; i++) {
            String problem = br.readLine();
            String[] split = problem.split("");
            int size = 0;
            for (int j = 0; j < problem.length(); j++) {
                if (split[j].equals("(")) {
                    size++;
                }
                if (split[j].equals(")")) {
                    size--;
                }
                if (size < 0) {
                    answer = "NO";
                    break;
                }
            }
            if (split[0].equals(")") || size != 0) {
                answer = "NO";
            } else {
                answer = "YES";
            }
            bw.write(answer + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }

}


