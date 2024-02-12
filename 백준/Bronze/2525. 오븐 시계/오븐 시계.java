import java.time.LocalTime;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hour = scanner.nextInt();
        int minute = scanner.nextInt();
        int during = scanner.nextInt();

        LocalTime startTime = LocalTime.of(hour, minute);
        LocalTime endTime = startTime.plusMinutes(during);

        System.out.println(endTime.getHour()+" "+endTime.getMinute());

    }
}