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
        int[][] path = new int[y][x];
        for (int i = 0; i < y; i++) {
            for (int j = 0; j < x; j++) {
                path[i][j] = map[i][j];
            }
        }

        final int[] UP_DOWN = {-1, 1, 0, 0};
        final int[] LEFT_RIGHT = {0, 0, -1, 1};
        int[][][] moveCount = new int[2][y][x];
        LinkedList<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{0, 0, 0});
        moveCount[0][0][0] = 1;
        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int currY = current[0];
            int currX = current[1];
            int currZ = current[2];

            for (int i = 0; i < 4; i++) {
                int nextY = currY + UP_DOWN[i];
                int nextX = currX + LEFT_RIGHT[i];
                if (nextY >= 0 && nextY < y && nextX >= 0 && nextX < x) {
                    if (map[nextY][nextX] == 1 && currZ == 0 && moveCount[1][nextY][nextX] == 0) {
                        moveCount[1][nextY][nextX] = moveCount[currZ][currY][currX] + 1;
                        queue.offer(new int[]{nextY, nextX, 1});
                    } else if (map[nextY][nextX] == 0 && moveCount[currZ][nextY][nextX] == 0
                            && moveCount[0][nextY][nextX] != 1) {
                        moveCount[currZ][nextY][nextX] = moveCount[currZ][currY][currX] + 1;
                        queue.offer(new int[]{nextY, nextX, currZ});
                    }

                }
            }

            if (currY == y - 1 && currX == x - 1) {
                return moveCount[currZ][currY][currX];
            }
        }

        return -1;
    }


}
