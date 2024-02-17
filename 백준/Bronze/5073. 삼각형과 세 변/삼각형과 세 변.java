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
        String answer = null;
        int[] distance = new int[3];
        for (; ; ) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 3; j++) {
                distance[j] = Integer.parseInt(st.nextToken());
            }
            if (distance[0] == 0 && distance[1] == 0 && distance[2] == 0) {
                break;
            }

            if (distance[0] == distance[1] && distance[1] == distance[2]) {
                answer = "Equilateral";
            } else if (distance[0] == distance[1] || distance[1] == distance[2] || distance[0] == distance[2]) {
                answer = "Isosceles";
            } else {
                answer = "Scalene";
            }
            Arrays.sort(distance);
            if (distance[distance.length - 1] >= (distance[0] + distance[1])) {
                answer = "Invalid";
            }

            bw.write(answer + "\n");
        }

        bw.flush();


    }

}