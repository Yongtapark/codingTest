import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int[][] doubleArr = new int[x][y];
        for (int i=0; i<2;i++){
            for(int j=0; j<x;j++){
                st = new StringTokenizer(br.readLine());
                for(int k=0; k<y;k++){
                    doubleArr[j][k] +=Integer.parseInt(st.nextToken());
                }
            }
        }

        for(int j=0; j<x;j++){
            for(int k=0; k<y;k++){
                bw.write(doubleArr[j][k]+" ");
            }
            bw.write("\n");
        }
        bw.flush();
    }
}