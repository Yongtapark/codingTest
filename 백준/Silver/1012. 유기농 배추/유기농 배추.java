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
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine());

        for(int k=0;k<t;k++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            m = Integer.parseInt(st.nextToken());
            n = Integer.parseInt(st.nextToken());
            int K = Integer.parseInt(st.nextToken());
            ArrayList<Integer> houseCounts = new ArrayList<>();
            isVisited = new boolean[m][n];

            map = new int[m][n];
            for (int i = 0; i < K; i++) {
                st = new StringTokenizer(br.readLine());
                int y = Integer.parseInt(st.nextToken());
                int x = Integer.parseInt(st.nextToken());
                map[y][x] = 1;
            }
            int totalCount = 0;
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if (map[i][j] != 0 && !isVisited[i][j]) {
                        totalCount++;
                        dfs(i, j);
                    }
                }
            }
            houseCounts.add(totalCount);

            for(int i=0;i<houseCounts.size();i++){
                sb.append(houseCounts.get(i)).append("\n");
            }
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();

    }

    static boolean[][] isVisited;
    static int n;
    static int m;
    static int[][] map;

    static void dfs(int y, int x) {
        isVisited[y][x] = true;
        int[] dy = new int[]{1, -1, 0, 0};
        int[] dx = new int[]{0, 0, -1, 1};

        for (int i = 0; i < 4; i++) {
            int ny = y + dy[i];
            int nx = x + dx[i];
            if (nx >= 0 && nx < n && ny >= 0 && ny < m) {
                if (map[ny][nx] == 1 && !isVisited[ny][nx]) {
                    dfs(ny, nx);
                }
            }
        }
    }

}