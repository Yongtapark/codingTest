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
        int[][] doubleArr = new int[9][9];
        for (int j = 0; j < 9; j++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int k = 0; k < 9; k++) {
                doubleArr[j][k] = Integer.parseInt(st.nextToken());
            }
        }

        int max =-1;
        int x = 0,y = 0;
        for (int j = 0; j < 9; j++) {
            for (int k = 0; k < 9; k++) {
                 if(doubleArr[j][k]>max){
                     max = doubleArr[j][k];
                     x = j+1;
                     y = k+1;
                 }
            }
        }

        System.out.println(max);
        System.out.println(x+" "+y);

        bw.flush();
    }
}