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
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        HashSet<Integer> hashSet = new HashSet<>();
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            int nNum = Integer.parseInt(st.nextToken());
            hashSet.add(nNum);
        }

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i++) {
            int mNum = Integer.parseInt(st.nextToken());
            if (hashSet.contains(mNum)) {
                hashSet.remove(mNum);
            } else {
                hashSet.add(mNum);
            }
        }

        bw.write(hashSet.size() + "\n");
        bw.flush();
        bw.close();
        br.close();
    }
}
