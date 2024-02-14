import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String sentence = br.readLine();
        StringBuilder sb = new StringBuilder(sentence);
        String[] cAlpha = {"dz=", "c=", "c-", "d-", "lj", "nj", "s=", "z="};
        int count = 0;

        for (int i = 0; i < sb.length();) {
            boolean found = false;
            for (int j = 0; j < cAlpha.length; j++) {
                if (sb.length() > 2 && i <= sb.length() - 3 && cAlpha[j].equals(sb.substring(i, i + 3))) {
                    i += 3;
                    count++;
                    found = true;
                    break;
                } else if (sb.length() > 1 && i <= sb.length() - 2 && cAlpha[j].equals(sb.substring(i, i + 2))) {
                    i += 2;
                    count++;
                    found = true;
                    break;
                }
            }
            if (!found) {
                i++;
                count++;
            }
        }

        bw.write(count+"\n");

        bw.flush();
    }
}