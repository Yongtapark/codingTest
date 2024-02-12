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
        int[] students = new int[30+1];

        for(int i=1;i<=28;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int studentNum = Integer.parseInt(st.nextToken());
            students[studentNum] = 1;
        }

        for(int i=1;i<=30;i++){
            if(students[i]==0){
                bw.write(i+"\n");
            }
        }
        bw.flush();
    }
}