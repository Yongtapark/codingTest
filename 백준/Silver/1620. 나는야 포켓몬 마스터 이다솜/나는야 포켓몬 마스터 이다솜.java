import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        HashMap<String, Integer> monsterNum = new HashMap<>();
        String[] monsterName = new String[N+1];

        for (int i = 0; i < N; i++) {
            String name = br.readLine();
            monsterName[i+1] = name;
            monsterNum.put(name, i+1);
        }

        for (int i = 0; i < M; i++) {
            String question = br.readLine();
            try {
                int monNum = Integer.parseInt(question);
                bw.write(monsterName[monNum] + "\n");
            } catch (NumberFormatException e) {
                bw.write(monsterNum.get(question) + "\n");
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
