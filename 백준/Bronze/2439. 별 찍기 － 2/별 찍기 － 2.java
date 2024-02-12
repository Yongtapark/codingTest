import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        String star = "*";
        String stars = "";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < count; i++) {
            for (int j=1;j<count-i;j++){
                sb.append(" ");
            }
            stars = stars + star;
            sb.append(stars+"\n");
        }
        System.out.println(sb);
    }
}