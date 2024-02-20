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

        int[] numbers = new int[20001];

        for (int i = 0; i < N; i++) {
            numbers[Integer.parseInt(br.readLine())+10000]++;
        }

        for(int i=0;i<20001;i++){
            if(numbers[i]!=0){
                for(int j=0; j<numbers[i];j++){
                    bw.write(i-10000+"\n");
                }
            }
        }
        bw.flush();
    }
}
