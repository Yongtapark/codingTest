import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        HashSet<String> hashSet = new HashSet<>();
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            if (hashSet.contains(name)) {
                hashSet.remove(name);
            } else {
                hashSet.add(name);
            }
        }
        String[] nowWorking = hashSet.toArray(new String[0]);
        Arrays.sort(nowWorking);
        for (int i = nowWorking.length - 1; i > -1; i--) {
            bw.write(nowWorking[i] + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
