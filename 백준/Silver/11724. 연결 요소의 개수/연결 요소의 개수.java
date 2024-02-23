import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        adjList = new ArrayList[n + 1];
        isVisited = new boolean[n+1];

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
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (!isVisited[i]) {
                dsf(i);
                count++;
            }
        }
        sb.append(count).append("\n");

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();

    }

    static List<Integer>[] adjList;
    static boolean[] isVisited;

    static void dsf(int v) {
        if (isVisited[v]) {
            return;
        }
        isVisited[v] = true;
        for (int i : adjList[v]) {
            dsf(i);
        }

    }


}