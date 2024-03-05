import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[] waiting = new int[N];

        for (int i = 0; i < N; i++) {
            waiting[i] = sc.nextInt();
        }
        Arrays.sort(waiting);

        int count = 0;
        int total = 0;
        for (int i = 0; i < N; i++) {
             count+=waiting[i];
             total += count;
        }
        System.out.println(total);



    }
}
