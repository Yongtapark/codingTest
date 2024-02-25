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
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int R = Integer.parseInt(st.nextToken());
        tmp = new int[N+1];

        adjList=new ArrayList[N+1];
        for(int i=1;i<=N;i++){
            adjList[i]=new ArrayList<>();
        }

        for(int i=0;i<M;i++){
            st =new StringTokenizer(br.readLine());
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
        for(int i=1;i<tmp.length;i++){
            sb.append(tmp[i]).append("\n");
        }


        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();

    }

    static ArrayList<Integer>[] adjList;
    static boolean[] isVisited;
    static StringBuilder sb =new StringBuilder();
    static int[] tmp;
    static int count=1;

    static void dfs(int v){
        if(isVisited[v]){
            return;
        }
        isVisited[v]=true;
        tmp[v]=count++;
        for(int i : adjList[v]){
            dfs(i);
        }
    }



}