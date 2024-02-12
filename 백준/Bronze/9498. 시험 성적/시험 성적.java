import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int examScore = scanner.nextInt();
        
        if (examScore >= 90 && examScore <= 100) {
            System.out.println("A");
        } else if (examScore >= 80 && examScore <= 89) {
            System.out.println("B");
        } else if (examScore >= 70 && examScore <= 79) {
            System.out.println("C");
        } else if (examScore >= 60 && examScore <= 69) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }

    }
}