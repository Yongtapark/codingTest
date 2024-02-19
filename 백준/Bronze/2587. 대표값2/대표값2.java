import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        final int NUMBER_COUNT = 5;
        final int MIDDLE_INDEX = 2;
        int[] numbers = new int[NUMBER_COUNT];
        int sum = 0;
        for (int i = 0; i < NUMBER_COUNT; i++) {
            numbers[i] = Integer.parseInt(br.readLine());
            sum += numbers[i];
        }

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < NUMBER_COUNT; j++) {
                if (numbers[j] < numbers[i]) {
                    int tmp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = tmp;
                }
            }
        }
        System.out.println(sum/NUMBER_COUNT);
        System.out.println(numbers[MIDDLE_INDEX]);
    }
}
