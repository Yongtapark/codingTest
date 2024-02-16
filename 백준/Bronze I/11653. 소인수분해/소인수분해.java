import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int M = Integer.parseInt(br.readLine());
        factorization(M);

    }

    private static void factorization(int M) {
        for (int i = 2; i < M + 1; i++) {
            if ((M % i) == 0) {
                System.out.println(i);
                factorization(M / i);
                return;
            }
        }
    }
}