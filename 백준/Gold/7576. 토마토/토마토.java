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
        m = Integer.parseInt(st.nextToken());
        n = Integer.parseInt(st.nextToken());
        map = new int[n][m];
        leftTomato = 0;

        for (int i = 0; i < n; i++) {
            String[] split = br.readLine().split(" ");
            for (int j = 0; j < m; j++) {
                int num = Integer.parseInt(split[j]);
                map[i][j] = num;
                if (num == 0) {
                    leftTomato++;
                }
            }
        }

        moveCount = new int[n][m];
        LinkedList<int[]> queue = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (map[i][j] == 1) {
                    queue.offer(new int[]{i, j});
                }
            }
        }
        int answer= 0;
        if(leftTomato!=0){
            answer = bfs(queue);
        }
        sb.append(answer).append("\n");
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();

    }

    static int[][] moveCount;
    static int leftTomato;
    static int m;
    static int n;
    static int[][] map;


    private static int bfs(LinkedList<int[]> queue) {
        final int[] MOVE_UP_DOWN = {1, -1, 0, 0};
        final int[] MOVE_LEFT_RIGHT = {0, 0, -1, 1};

        while (!queue.isEmpty()) {
            int[] nextStep = queue.poll();
            int currY = nextStep[0];
            int currX = nextStep[1];

            for (int i = 0; i < 4; i++) {

                int moveY = currY + MOVE_UP_DOWN[i];
                int moveX = currX + MOVE_LEFT_RIGHT[i];

                if (moveY >= 0 && moveY < n && moveX >= 0 && moveX < m && map[moveY][moveX] == 0) {
                    map[moveY][moveX] = 1;
                    leftTomato--;
                    moveCount[moveY][moveX] = moveCount[currY][currX] + 1;
                    queue.offer(new int[]{moveY, moveX});
                }
                if (leftTomato == 0) {
                    return moveCount[moveY][moveX];
                }
            }
        }
        return -1;

    }

}
