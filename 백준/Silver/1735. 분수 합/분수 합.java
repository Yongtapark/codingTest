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
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());
        int aSon = Integer.parseInt(st.nextToken());
        int aMom = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int bSon = Integer.parseInt(st.nextToken());
        int bMom = Integer.parseInt(st.nextToken());

        int gcd = gcd(aMom, bMom);
        int lcm = (aMom * bMom) / gcd;

        int equalizeASon = aSon * (lcm / aMom);
        int equalizeBSon = bSon * (lcm / bMom);

        int combinedNum = equalizeASon + equalizeBSon;
        int rfVal = gcd(combinedNum, lcm);

        sb.append(combinedNum / rfVal).append(" ");
        sb.append(lcm / rfVal).append("\n");

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }

    static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b,a%b);
    }
}


