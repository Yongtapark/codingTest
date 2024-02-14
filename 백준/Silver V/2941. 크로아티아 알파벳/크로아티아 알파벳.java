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
        String[] cAlpha = {"dz=", "c=", "c-", "d-", "lj", "nj", "s=", "z="};
        int count = 0;

        for (int i = 0; i < sentence.length(); ) {
            boolean isFound = false;
            for (int j = 0; j < cAlpha.length; j++) {
                if (i <= sentence.length() - 3 && cAlpha[j].equals(sentence.substring(i, i+3))) {
                    isFound = true;
                    i += 3;
                    count++;
                    break;
                } else if (i <= sentence.length() - 2 && cAlpha[j].equals(sentence.substring(i, i+2))) {
                    isFound = true;
                    i += 2;
                    count++;
                    break;
                }

            }
            if (!isFound) {
                i++;
                count++;
            }

        }
        System.out.println(count);

        bw.flush();
    }
}