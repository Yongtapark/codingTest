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

        int[][] map = new int[n][m];
        for (int i = 0; i < n; i++) {
            String[] split = br.readLine().split("");
            for (int j = 0; j < m; j++) {
                map[i][j] = Integer.parseInt(split[j]);
            }
        }
        int answer = bfs(map, n, m);
        sb.append(answer).append("\n");

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();

    }

    static int bfs(int[][] map, int y, int x) {
        int[] upAndDown = new int[]{-1, 1, 0, 0};
        int[] leftAndRight = new int[]{0, 0, -1, 1};
        int[][][] visitCount = new int[2][y][x];
        LinkedList<int[]> queue = new LinkedList<>();
        visitCount[0][0][0] = 1;
        queue.offer(new int[]{0, 0, 0});
        while (!queue.isEmpty()) {
            int[] next = queue.poll();
            int currZ = next[0];
            int currY = next[1];
            int currX = next[2];
            for (int i = 0; i < 4; i++) {
                int nextY = currY + upAndDown[i];
                int nextX = currX + leftAndRight[i];
                if (nextY >= 0 && nextY < y && nextX >= 0 && nextX < x) {
                    if (map[nextY][nextX] == 1 && visitCount[1][nextY][nextX] == 0 &&currZ==0) {
                        visitCount[1][nextY][nextX] = visitCount[currZ][currY][currX] + 1;
                        queue.add(new int[]{1, nextY, nextX});
                    } else if (map[nextY][nextX] == 0 && visitCount[currZ][nextY][nextX] == 0
                            && visitCount[0][nextY][nextX] != 1) {
                        visitCount[currZ][nextY][nextX] = visitCount[currZ][currY][currX] + 1;
                        queue.add(new int[]{currZ, nextY, nextX});
                    }
                }
            }
            if (currY == y-1 && currX == x-1) {
                return visitCount[currZ][currY][currX];
            }
        }

        return -1;
    }


}
