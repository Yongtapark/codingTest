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
       // StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());

        adjList = new ArrayList[n + 1];
        isVisited = new boolean[n + 1];
        visitedOrder = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            adjList[i] = new ArrayList<>();
        }
        for (int i = 0; i < m; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            adjList[a].add(b);
            adjList[b].add(a);
        }
        dfs(1);
        //bfs(1);

        sb.append(visitCount).append("\n");



        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();


    }

    static ArrayList<Integer>[] adjList;
    static boolean[] isVisited;
    static int visitCount = 0;
    static int[] visitedOrder;

    static void dfs(int v){
        isVisited[v]=true;
        for(int i : adjList[v]){
            if(!isVisited[i]){
                dfs(i);
                visitCount++;
            }
        }
    }

    static void bfs(int start) {
        LinkedList<Integer> queue = new LinkedList<>();
        queue.offer(start);
        isVisited[start] = true;
        while (!queue.isEmpty()){
            Integer v = queue.poll();
            for(int i : adjList[v]){
                if(!isVisited[i]){
                    queue.offer(i);
                    isVisited[i]=true;
                    visitCount++;
                }
            }
        }
    }
}