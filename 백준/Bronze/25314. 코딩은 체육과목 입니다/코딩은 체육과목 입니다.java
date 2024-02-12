import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int byteLong = num / 4;
        String answer = "";
        for (int i = 0; i < byteLong; i++) {
            answer = answer + "long ";
        }
        System.out.println(answer + "int");


    }
}