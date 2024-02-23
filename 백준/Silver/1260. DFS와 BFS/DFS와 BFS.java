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
        int nodeCount = Integer.parseInt(st.nextToken());
        int edgeCount = Integer.parseInt(st.nextToken());
        int startNode = Integer.parseInt(st.nextToken());

        adjList = new ArrayList[nodeCount + 1];
        for (int i = 1; i <= nodeCount; i++) {
            adjList[i] = new ArrayList<>();
        }

        for (int i = 0; i < edgeCount; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            adjList[a].add(b);
            adjList[b].add(a);
        }

        for (int i = 1; i <= nodeCount; i++) {
            Collections.sort(adjList[i]);
        }

        isVisited = new boolean[nodeCount + 1];
        dfs(startNode);

        sb.append("\n");
        
        isVisited = new boolean[nodeCount + 1];
        bfs(startNode);
        
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();

    }

    static ArrayList<Integer>[] adjList;
    static boolean[] isVisited;
    static StringBuilder sb = new StringBuilder();

    static void dfs(int v) {
        if (isVisited[v]) {
            return;
        }
        isVisited[v] = true;
        sb.append(v).append(" ");
        for (int i : adjList[v]) {
            dfs(i);
        }
    }

    static void bfs(int start){
        LinkedList<Integer> queue = new LinkedList<>();
        queue.offer(start);
        isVisited[start] = true;
        while (!queue.isEmpty()){
            Integer v = queue.poll();
            sb.append(v).append(" ");
            for(int i : adjList[v]){
                if(!isVisited[i]){
                    queue.offer(i);
                    isVisited[i]= true;
                }
            }
        }
    }


}