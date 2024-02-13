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

        int count = Integer.parseInt(br.readLine());

        for(int i=0;i<count;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int repeat = Integer.parseInt(st.nextToken());
            String[] sentences = st.nextToken().split("");
            for(int j=0;j<sentences.length;j++){
                StringBuilder sb = new StringBuilder().append(sentences[j].repeat(repeat));
                bw.write(sb.toString());
            }
            bw.write("\n");
        }
        bw.flush();
    }
}