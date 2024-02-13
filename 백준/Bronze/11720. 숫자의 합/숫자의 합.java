import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int count= Integer.parseInt(br.readLine());
        String[] split = br.readLine().split("");
        int total=0;
        for(int i=0;i<count;i++){
           total += Integer.valueOf(split[i]);
        }
        bw.write(total+"\n");
        bw.flush();
    }
}