import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int count = Integer.parseInt(br.readLine());
        for(int i=0;i<count;i++){
            StringBuilder sb = new StringBuilder();
            String sentence = br.readLine();
            sb.append(sentence.charAt(0));
            sb.append(sentence.charAt(sentence.length()-1));
            bw.write(sb+"\n");
        }
        bw.flush();

    }
}