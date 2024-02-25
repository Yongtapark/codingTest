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
        sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        map = new int[n+1][m+1];
        isVisited = new boolean[n+1][m+1];
        distance = new int[n+1][m+1];

        for (int i = 1; i <= n; i++) {
            String[] split = br.readLine().split("");
            for (int j = 1; j <= m; j++) {
                map[i][j] = Integer.parseInt(split[j-1]);
            }
        }

        dfs(1,1);

        sb.append(distance[n][m]).append("\n");


        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();

    }

    static int n;
    static int m;
    static int[][] map;
    static boolean[][] isVisited;
    static int[][] distance;
    static StringBuilder sb = new StringBuilder();

    static int dfs(int y, int x) {
        LinkedList<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{y,x});
        isVisited[y][x] = true;
        distance[y][x] = 1;
        int[] dy = {1, -1, 0, 0};
        int[] dx = {0, 0, -1, 1};

        while (!queue.isEmpty()){
            int[] current = queue.poll();

            int curY = current[0];
            int curX = current[1];

            if(curY == n && curX == m){
                return distance[curY][curX];
            }
            for (int i = 0; i < 4; i++) {
                int ny = curY + dy[i];
                int nx = curX + dx[i];
                if (ny >= 0 && ny <= n && nx >= 0 && nx <= m) {
                    if (!isVisited[ny][nx] && map[ny][nx] != 0) {
                        isVisited[ny][nx] = true;
                        distance[ny][nx] = distance[curY][curX]+1;
                        queue.offer(new int[]{ny,nx});
                    }
                }
            }
        }
        return -1;
    }


}