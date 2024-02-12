import java.time.LocalTime;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hour = scanner.nextInt();
        int minute = scanner.nextInt();

        LocalTime alarmTime = LocalTime.of(hour, minute).minusMinutes(45);
        System.out.println(alarmTime.getHour()+" "+alarmTime.getMinute());
        

    }
}