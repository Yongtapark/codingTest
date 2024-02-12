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
        int[] numbers = new int[10];

        for (int i = 0; i < 10; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int num = Integer.parseInt(st.nextToken());
            numbers[i] = num % 42;
        }
        Arrays.sort(numbers);
        int distinct = numbers[0];
        int count = 1;
        for (int i = 0; i < 10; i++) {
            if (numbers[i] != distinct) {
                distinct = numbers[i];
                count++;
            }
        }
        bw.write(count + "\n");
        bw.flush();
    }
}