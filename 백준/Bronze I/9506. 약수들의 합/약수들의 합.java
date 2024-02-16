import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (; ; ) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            if (n == -1) {
                break;
            }
            int sum = 0;
            String answer = getPerfects(n, sum);
            bw.write(answer + "\n");
            bw.flush();
        }


    }

    private static String getPerfects(int n, int sum) {
        String answer;
        StringBuilder factors = new StringBuilder();
        ArrayList<Integer> numList = getFactors(n);
        for (Integer num : numList) {
            sum += num;
        }
        if (sum == n) {
            for (int i = 0; i < numList.size(); i++) {
                if(i!=numList.size()-1){
                    factors.append(numList.get(i)).append(" + ");
                }else {
                    factors.append(numList.get(i));
                }
            }
            answer = n + " = " + factors;
        } else {
            answer = n + " is NOT perfect.";
        }
        return answer;
    }

    private static ArrayList<Integer> getFactors(int n) {
        ArrayList<Integer> numList = new ArrayList<>();
        for (int i = 1; i < n + 1; i++) {
            if (n % i == 0) {
                numList.add(i);
            }
        }
        numList.remove(Integer.valueOf(n));
        return numList;
    }
}