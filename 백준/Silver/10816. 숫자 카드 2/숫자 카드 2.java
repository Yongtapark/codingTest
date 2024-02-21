import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] myCards = new int[N];
        for (int i = 0; i < N; i++) {
            myCards[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(myCards);

        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        int[] cardTable = new int[M];
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < M; i++) {
            int num = Integer.parseInt(st.nextToken());
            cardTable[i] = num;
            hashMap.put(num,0);
        }


        for (int i = 0; i < N; i++) {
            if (hashMap.containsKey(myCards[i])) {
                Integer count = hashMap.get(myCards[i]);
                count+=1;
                hashMap.put(myCards[i],count);
            }
        }

        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < M; i++) {
            answer.append(hashMap.get(cardTable[i])).append(" ");
        }

        bw.write(answer.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}
