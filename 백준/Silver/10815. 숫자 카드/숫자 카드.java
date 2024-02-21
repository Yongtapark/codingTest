import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        HashSet<Integer> cardsToCompare = new HashSet<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            cardsToCompare.add(Integer.parseInt(st.nextToken()));
        }

        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        int[] cards = new int[M];
        for (int i = 0; i < M; i++) {
            int cardNum = Integer.parseInt(st.nextToken());
            if (cardsToCompare.contains(cardNum)) {
                cards[i] = 1;
            }
        }

        for (int i = 0; i < M; i++) {
            bw.write(cards[i] + " ");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
