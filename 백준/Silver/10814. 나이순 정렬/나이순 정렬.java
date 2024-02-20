import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        String[][] strArr = new String[N][3];
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            strArr[i][0] = st.nextToken();
            strArr[i][1] = st.nextToken();
            strArr[i][2] = String.valueOf(i);
        }

        Arrays.sort(strArr, (o1, o2) -> {
            if (Integer.parseInt(o1[0])==Integer.parseInt(o2[0])) {
                return Integer.parseInt(o1[2])-Integer.parseInt(o2[2]);
            }
            return Integer.parseInt(o1[0])-Integer.parseInt(o2[0]);
        });

        for(int i=0; i<N;i++){
            bw.write(strArr[i][0]+" "+strArr[i][1]+"\n");
        }

        bw.flush();
    }
}
