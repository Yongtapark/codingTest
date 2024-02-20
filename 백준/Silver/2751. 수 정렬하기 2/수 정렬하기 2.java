import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());

        boolean[] numbers = new boolean[2000001];

        for (int i = 0; i < N; i++) {
            numbers[Integer.parseInt(br.readLine())+1000000] = true;
        }

        for(int i=0;i<2000001;i++){
            if(numbers[i]){
                bw.write(i-1000000+"\n");
            }
        }
        bw.flush();
    }
}
