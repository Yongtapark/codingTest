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
        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());
        int R = 1;

        adjList=new ArrayList[N+1];
        for(int i=1;i<=N;i++){
            adjList[i]=new ArrayList<>();
        }

        for(int i=0;i<M;i++){
            StringTokenizer st =new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            adjList[a].add(b);
            adjList[b].add(a);
        }

        for(int i=1;i<=N;i++){
            Collections.sort(adjList[i]);
        }

        isVisited =new boolean[N+1];
        dfs(R);
        /*for (boolean b : isVisited) {
            if(b){
                count++;
            }
        }*/
        sb.append(count-1).append("\n");


        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();

    }

    static ArrayList<Integer>[] adjList;
    static boolean[] isVisited;
    static StringBuilder sb =new StringBuilder();
    static int count=0;

    static void dfs(int v){
        if(isVisited[v]){
            return;
        }
        count++;
        isVisited[v]=true;
        for(int i : adjList[v]){
            dfs(i);
        }
    }



}