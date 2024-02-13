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
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        char[] charArray = st.nextToken().toCharArray();
        int spendTime = 0;
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] == 'A' || charArray[i] == 'B' || charArray[i] == 'C') {
                spendTime += 2 + 1;
            } else if (charArray[i] == 'D' || charArray[i] == 'E' || charArray[i] == 'F') {
                spendTime += 3 + 1;
            } else if (charArray[i] == 'G' || charArray[i] == 'H' || charArray[i] == 'I') {
                spendTime += 4 + 1;
            } else if (charArray[i] == 'J' || charArray[i] == 'K' || charArray[i] == 'L') {
                spendTime += 5 + 1;
            } else if (charArray[i] == 'M' || charArray[i] == 'N' || charArray[i] == 'O') {
                spendTime += 6 + 1;
            } else if (charArray[i] == 'P' || charArray[i] == 'Q' || charArray[i] == 'R' || charArray[i] == 'S') {
                spendTime += 7 + 1;
            } else if (charArray[i] == 'T' || charArray[i] == 'U' || charArray[i] == 'V') {
                spendTime += 8 + 1;
            } else if (charArray[i] == 'W' || charArray[i] == 'X' || charArray[i] == 'Y' || charArray[i] == 'Z') {
                spendTime += 9 + 1;
            }
        }

        bw.write(spendTime + "\n");
        bw.flush();
    }
}