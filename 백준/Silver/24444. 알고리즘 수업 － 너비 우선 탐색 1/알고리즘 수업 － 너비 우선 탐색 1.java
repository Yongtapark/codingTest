import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.StringTokenizer;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int r = Integer.parseInt(st.nextToken());

        adjList = new ArrayList[n + 1];
        isVisited = new boolean[n+1];
        visitCount =new int[n+1];
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
        for (int i=1;i<=n;i++){
            Collections.sort(adjList[i]);
        }

        bfs(r);

        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <=n ; i++) {
            sb.append(visitCount[i]).append("\n");
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();



    }

    static boolean[] isVisited;
    static ArrayList<Integer>[] adjList;
    static int[] visitCount;
    static int currentOrder = 1;

    static void dfs(int v) {
        if (isVisited[v]) {
            return;
        }
        visitCount[v] = currentOrder++;
        isVisited[v] = true;
        for (int i : adjList[v]) {
            dfs(i);
        }
    }

    static void bfs(int start){
        LinkedList<Integer> queue = new LinkedList<>();
        queue.offer(start);
        isVisited[start]= true;
        visitCount[start] = currentOrder++;

        while (!queue.isEmpty()){
            Integer v = queue.poll();
            for(int i : adjList[v]){
                if(!isVisited[i]){
                    queue.offer(i);
                    isVisited[i]=true;
                    visitCount[i] = currentOrder++;
                }
            }
        }
    }


}