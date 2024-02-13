import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] helChessCount = {1,1,2,2,2,8};
        for (int i=0;i<helChessCount.length;i++){
            helChessCount[i] = helChessCount[i] - Integer.parseInt(st.nextToken());
            bw.write(helChessCount[i]+" ");
        }
        bw.flush();
    }
}