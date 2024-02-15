import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] changeArr = {25,10,5,1};
        
        Integer T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            int C = Integer.parseInt(br.readLine());
            for(int j=0; j<changeArr.length;j++){
                bw.write(C/changeArr[j]+" ");
                C = C%changeArr[j];
            }
            bw.write("\n");
        }
        bw.flush();
    }
}