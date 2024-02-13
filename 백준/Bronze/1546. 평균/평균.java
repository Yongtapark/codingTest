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
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int count = Integer.parseInt(st.nextToken());
        int[] scores = new int[count];
        int max=0;
        float total=0;
        
        st = new StringTokenizer(br.readLine());
        
        for(int i=0;i<count;i++){
            scores[i] = Integer.parseInt(st.nextToken());
            if(scores[i]>max){
                max=scores[i];
            }
        }
        
        for(int i=0;i<count;i++){
            total += ((float)scores[i] / max * 100);
        }

        bw.write((total/count)+"\n");
        bw.flush();
    }
}