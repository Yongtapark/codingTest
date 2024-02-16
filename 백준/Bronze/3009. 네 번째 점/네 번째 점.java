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
        int[] xPositions = new int[3];
        int[] yPositions = new int[3];
        for (int i = 0; i < 3; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            xPositions[i] = x;
            yPositions[i] = y;
        }

        int answerX = 0;
        int answerY = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = i + 1; j < 3; j++) {
                if (xPositions[i] == xPositions[j]) {
                    xPositions[i] = -1;
                    xPositions[j] = -1;
                }
                if (yPositions[i] == yPositions[j]) {
                    yPositions[i] = -1;
                    yPositions[j] = -1;
                }
            }
            if (xPositions[i] != -1) {
                answerX = xPositions[i];
            }
            if (yPositions[i] != -1) {
                answerY = yPositions[i];
            }
        }

        bw.write(answerX + " " + answerY);

        bw.flush();


    }

}