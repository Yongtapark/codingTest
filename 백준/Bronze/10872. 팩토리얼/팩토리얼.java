import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        int sum = 1;
        for (int i = n; i > 0; i--) {
            sum = sum * i;
        }
        sb.append(sum).append("\n");
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();

    }


}
