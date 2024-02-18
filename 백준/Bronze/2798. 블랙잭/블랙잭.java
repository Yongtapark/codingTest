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
        StringTokenizer st = new StringTokenizer(br.readLine());

        int count = Integer.parseInt(st.nextToken());
        int goalPoint = Integer.parseInt(st.nextToken());
        int[] cards = new int[count];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < count; i++) {
            cards[i] = Integer.parseInt(st.nextToken());
        }
        long comparationPoint = Integer.MAX_VALUE;
        int closePoint = 0;
        for (int i = 0; i < cards.length; i++) {
            for (int j = i + 1; j < cards.length; j++) {
                for (int k = j + 1; k < cards.length; k++) {
                    int sumPoint = cards[i] + cards[j] + cards[k];
                    if (comparationPoint >= goalPoint - sumPoint && sumPoint<=goalPoint) {
                        comparationPoint = goalPoint - sumPoint;
                        closePoint = sumPoint;
                    }
                }
            }
        }
        bw.write(closePoint+"\n");
        bw.flush();

    }

}
