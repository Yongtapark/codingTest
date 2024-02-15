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
        double A = Integer.parseInt(st.nextToken()); // 낮에 올라가는 길이
        double B = Integer.parseInt(st.nextToken()); // 미끄러지는 길이
        double V = Integer.parseInt(st.nextToken()); // 나무의 길이
        int dayCount;
        
        dayCount = (int) Math.ceil((V-A)/(A-B)+1);
        
        bw.write(dayCount + "\n");
        bw.flush();
    }
}