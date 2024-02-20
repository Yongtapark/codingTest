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
        final int X_INDEX = 0;
        final int Y_INDEX = 1;
        final int COORDINATE_SIZE = 2;

        int N = Integer.parseInt(st.nextToken());
        int[][] numbers = new int[N][COORDINATE_SIZE];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            numbers[i][X_INDEX]= Integer.parseInt(st.nextToken());
            numbers[i][Y_INDEX] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(numbers,(y1,y2) -> {
            if(y1[0]==y2[0]) return y1[1] -y2[1];
            else return y1[0] - y2[0];
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
