import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int answer = 0;
        for (int i=0;i<=num;i++){
            answer = answer+i;
        }
        System.out.println(answer);

    }
}