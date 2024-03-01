import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        //int r = Integer.parseInt(st.nextToken());

        int[][] map = new int[n][m];
        isVisited = new int[n][m];

        for (int i = 0; i < n; i++) {
            String[] split = br.readLine().split("");
            for (int j = 0; j < m; j++) {
                map[i][j] = Integer.parseInt(split[j]);
            }
        }

        int count = bfs(map, n, m);

        sb.append(count).append("\n");
        bw.write(sb.toString());

        bw.flush();
        bw.close();
        br.close();

    }

    static int[][] isVisited;

    static int bfs(int[][] map, int y, int x) {
        int[] upDown = {-1, 1, 0, 0};
        int[] leftRight = {0, 0, -1, 1};
        LinkedList<int[]> queue = new LinkedList<>();
        isVisited[0][0] = 1;
        queue.offer(new int[]{0, 0});
        while (!queue.isEmpty()) {
            int[] curr = queue.poll();
            int currY = curr[0];
            int currX = curr[1];
            for (int i = 0; i < 4; i++) {
                int nextY = currY + upDown[i];
                int nextX = currX + leftRight[i];
                if (nextY >= 0 && nextY < y && nextX >= 0 && nextX < x) {
                    if (map[nextY][nextX] == 1 && isVisited[nextY][nextX]==0) {
                        isVisited[nextY][nextX] = isVisited[currY][currX]+1;
                        queue.offer(new int[]{nextY, nextX});
                    }
                }
            }
            if (currY == y - 1 && currX == x - 1) {
                return isVisited[currY][currX];
            }
        }
        return -1;
    }


}
