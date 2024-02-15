import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        ArrayList<Integer> factorList = new ArrayList<>();
        for (int i = 1; i < N+1; i++) {
            if (N % i == 0) {
                factorList.add(i);
            }
        }

        int findNumber = 0;
        if (factorList.size() >= K) {
            findNumber = factorList.get(K-1);
        }

        bw.write(findNumber + "\n");

        bw.flush();
    }
}