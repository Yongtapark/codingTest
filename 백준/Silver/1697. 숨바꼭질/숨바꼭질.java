import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int[] timeCount = new int[100001];

        int answer = bfs(n, k, timeCount);
        sb.append(answer).append("\n");
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();

    }

    public static int bfs(int n, int k, int[] timeCount) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(n);
        timeCount[n] = 1;
        while (!queue.isEmpty()) {
            Integer v = queue.poll();

            if (v == k) {
                return timeCount[v] - 1;
            }

            int[] step = {v - 1, v + 1, v * 2};
            for (int cal : step) {
                if (cal >= 0 && cal <= 100000 && timeCount[cal] == 0) {
                    timeCount[cal] = timeCount[v] + 1;
                    queue.offer(cal);
                }
            }
        }
        return -1;
    }
}
