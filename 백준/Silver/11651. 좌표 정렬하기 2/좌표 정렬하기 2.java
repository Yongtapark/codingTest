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
        StringTokenizer st = new StringTokenizer(br.readLine());
        final int COORDINATE_SIZE = 2;

        int N = Integer.parseInt(st.nextToken());
        int[][] numbers = new int[N][COORDINATE_SIZE];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            numbers[i][0]= Integer.parseInt(st.nextToken());
            numbers[i][1] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(numbers,(o1,o2) -> {
            if(o1[1]==o2[1])
                return o1[0] -o2[0];
            return o1[1] - o2[1];
        });


        for (int i = 0; i < N; i++) {
            for(int j=0; j<COORDINATE_SIZE;j++){
                bw.write(numbers[i][j]+" ");
            }
            bw.write("\n");
        }


        bw.flush();
    }
}
