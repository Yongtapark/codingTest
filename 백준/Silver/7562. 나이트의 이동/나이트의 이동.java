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

        int repeatCount = Integer.parseInt(br.readLine());
        for (int i = 0; i < repeatCount; i++) {
            oneSide = Integer.parseInt(br.readLine());

            StringTokenizer st = new StringTokenizer(br.readLine());
            int currentY = Integer.parseInt(st.nextToken());
            int currentX = Integer.parseInt(st.nextToken());

            st = new StringTokenizer(br.readLine());
            int targetY = Integer.parseInt(st.nextToken());
            int targetX = Integer.parseInt(st.nextToken());

            moveCount = new int[oneSide][oneSide];
            isVisited = new boolean[oneSide][oneSide];
            
            int[] current = {currentY, currentX};
            int[] target = {targetY, targetX};
            int answer = bfs(current, target);
            sb.append(answer).append("\n");

        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();

    }

    static boolean[][] isVisited;
    static int[][] moveCount;
    static int oneSide;

    private static int bfs(int[] current, int[] target) {
        final int[] MOVE_UP_DOWN = {2, 2, -2, -2, -1, 1, -1, 1};
        final int[] MOVE_LEFT_RIGHT = {1, -1, 1, -1, -2, -2, 2, 2};
        LinkedList<int[]> queue = new LinkedList<int[]>();
        int curY = current[0];
        int curX = current[1];
        queue.offer(new int[]{curY, curX});
        moveCount[curY][curX] = 1;
        isVisited[curY][curX] = true;
        while (!queue.isEmpty()) {
            int[] next = queue.poll();
            int nextY = next[0];
            int nextX = next[1];
            if (nextY == target[0] && nextX == target[1]) {

                return moveCount[nextY][nextX] - 1;
            }
            for (int i = 0; i < 8; i++) {
                int moveY = nextY + MOVE_UP_DOWN[i];
                int moveX = nextX + MOVE_LEFT_RIGHT[i];
                if (moveY >= 0 && moveY < oneSide && moveX >= 0 && moveX < oneSide) {
                    if (!isVisited[moveY][moveX] && moveCount[moveY][moveX] == 0) {
                        isVisited[moveY][moveX] = true;
                        moveCount[moveY][moveX] = moveCount[nextY][nextX] + 1;
                        queue.offer(new int[]{moveY, moveX});
                    }
                }
            }


        }
        return -1;

    }

}
