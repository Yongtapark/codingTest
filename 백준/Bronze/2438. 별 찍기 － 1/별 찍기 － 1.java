import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        String star = "*";
        String stars = "";
        for (int i = 0; i < count; i++) {
            stars = stars + star;
            System.out.println(stars);
        }
    }
}