import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int[] numbers = new int[N];
        for (int i = 0; i < N; i++) {
            numbers[i] = Integer.parseInt(br.readLine());
        }


        for(int i=0;i<numbers.length;i++){
            for(int j=i+1;j<N;j++){
                if (numbers[j] < numbers[i]) {
                    int tmp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = tmp;
                }
            }
        }
        
        for(int i=0;i<N;i++){
            System.out.println(numbers[i]);
        }
    }
}
