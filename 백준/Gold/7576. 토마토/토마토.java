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
        int[][] map = new int[n][m];
        isVisited = new int[n][m];
        int zeroCount =0;
        for (int i = 0; i < n; i++) {
            String[] split = br.readLine().split(" ");
            for (int j = 0; j < m; j++) {
                map[i][j] = Integer.parseInt(split[j]);
                if (map[i][j]==0){
                    zeroCount++;
                }
            }
        }
        LinkedList<int[]> queue = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(map[i][j]==1){
                    queue.offer(new int[]{i,j});
                    isVisited[i][j] = 1;
                }
            }
        }
        int answer =0;
        if(zeroCount!=0){
            answer = bfs(zeroCount, queue,map);
        }
        sb.append(answer).append("\n");

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();

    }

    static int[][] isVisited;
    static int n;
    static int m;

    static int bfs(int zeroCount,LinkedList<int[]> queue,int[][] map) {
        int[] height = {1, -1, 0, 0};
        int[] level = {0, 0, -1, 1};

        while (!queue.isEmpty()) {
            int[] curr = queue.poll();
            int currY = curr[0];
            int currX = curr[1];
            for (int i = 0; i < 4; i++) {
                int nextY = currY + height[i];
                int nextX = currX + level[i];
                if (nextY >= 0 && nextY < n && nextX >= 0 && nextX < m) {
                    if (isVisited[nextY][nextX] == 0 && map[nextY][nextX]!=-1) {
                        isVisited[nextY][nextX] = isVisited[currY][currX] + 1;
                        queue.offer(new int[]{nextY, nextX});
                        zeroCount--;
                    }
                }
            }
            if(zeroCount==0){
                return isVisited[currY][currX];
            }
        }
        return -1;
    }


}
