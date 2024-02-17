import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int [] triangleDistance = new int[3];
        for(int i=0;i<triangleDistance.length;i++){
            triangleDistance[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(triangleDistance);
        int longestDistance = triangleDistance[triangleDistance.length - 1];
        int exceptMostLong = triangleDistance[0] + triangleDistance[1];
        if (longestDistance >= exceptMostLong) {
            longestDistance = exceptMostLong-1;
        }

        bw.write(longestDistance+exceptMostLong+"\n");
        bw.flush();


    }

}