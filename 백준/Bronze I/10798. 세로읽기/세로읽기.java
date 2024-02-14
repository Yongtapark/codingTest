import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[][] doubleArr = new String[5][15];
        for (int j = 0; j < 5; j++) {
            String line = br.readLine();
            String[] charArray = new String[15];
            for (int k = 0; k < line.length(); k++) {
                charArray[k] = String.valueOf(line.charAt(k));
            }
            for (int k = 0; k < line.length(); k++) {
                doubleArr[j][k] = charArray[k];
            }
        }

        for (int j = 0; j < 15; j++) {
            for (int k = 0; k < 5; k++) {
                if (doubleArr[k][j] != null) {
                    bw.write(doubleArr[k][j]);
                }
            }
        }

        bw.flush();
    }
}