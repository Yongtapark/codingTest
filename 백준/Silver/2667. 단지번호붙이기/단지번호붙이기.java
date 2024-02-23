import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        n = Integer.parseInt(br.readLine());
        isVisited = new boolean[n][n];

        map = new int[n][n];
        int totalCount =0;

        for (int i = 0; i < n; i++) {
            String[] split = br.readLine().split("");
            for (int j = 0; j < n; j++) {
                int val = Integer.parseInt(split[j]);
                map[i][j] = val;
            }
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(map[i][j]!=0 && !isVisited[i][j]){
                    totalCount++;
                    houseCounts.add(dfs(i, j)) ;
                }
            }
        }
        Collections.sort(houseCounts);
        
        sb.append(totalCount).append("\n");
        for (int i = 0; i < houseCounts.size(); i++) {
            sb.append(houseCounts.get(i)).append("\n");
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();

    }

    static boolean[][] isVisited;
    static int n;
    static int [][]map;
    static ArrayList<Integer> houseCounts = new ArrayList<>();
    static int dfs(int x, int y) {
        int innerCount=1;

        isVisited[x][y] = true;
        map[x][y] = 3;
        int[] dx = new int[]{0, 0, -1, 1};
        int[] dy = new int[]{1, -1, 0, 0};

        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            if(nx>=0 && nx<n&&ny>=0&&ny<n){
                if(map[nx][ny] == 1 && !isVisited[nx][ny]){
                    innerCount += dfs(nx, ny);
                }
            }
        }
        return innerCount;
    }

}