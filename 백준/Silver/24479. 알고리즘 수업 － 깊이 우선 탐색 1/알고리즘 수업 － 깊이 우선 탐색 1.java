import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int r = Integer.parseInt(st.nextToken());
        StringBuilder sb = new StringBuilder();
        adjList = new ArrayList[n + 1];
        isVisited = new boolean[n + 1];
        visitedOrder = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            adjList[i] = new ArrayList<>();
        }
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            adjList[a].add(b);
            adjList[b].add(a);
        }
        for (int i = 1; i <=n ; i++) {
            Collections.sort(adjList[i]);
        }

        dfs(r);

        for (int i = 1; i <=n ; i++) {
            sb.append(visitedOrder[i]).append("\n");
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();


    }

    static ArrayList<Integer>[] adjList;
    static boolean[] isVisited;
    static int visitCount = 1;
    static int[] visitedOrder;

   static void dfs(int v) {
        if (isVisited[v]) {
            return;
        }
        isVisited[v] = true;
        visitedOrder[v]=visitCount++;
        for (int i : adjList[v]) {
            dfs(i);
        }
    }


}