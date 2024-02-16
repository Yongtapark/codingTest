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
         int x = Integer.parseInt(st.nextToken());
         int y = Integer.parseInt(st.nextToken());
         int w = Integer.parseInt(st.nextToken());
         int h = Integer.parseInt(st.nextToken());
         int wideDistance = Math.min(w - x, x);
         int heightDistance = Math.min(h - y, y);
         if(wideDistance<heightDistance){
             bw.write(wideDistance+"\n");
         }else {
             bw.write(heightDistance+"\n");
         }
         bw.flush();


    }

}