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
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int AReverse = getaReverse(A);
        int BReverse = getaReverse(B);
        bw.write(Math.max(AReverse, BReverse)+"\n");
        bw.flush();
    }

    private static int getaReverse(int num) {
        int first = num / 100;
        int second = num % 100 /10;
        int third = num %10;
        return (third*100)+(second*10)+(first);
    }
}