import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalAmount = scanner.nextInt();
        int count = scanner.nextInt();
        for(int i=0;i<count;i++){
            int amount = scanner.nextInt();
            int eachCount = scanner.nextInt();
            totalAmount -= amount*eachCount;
        }
        if(totalAmount==0){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
        

    }
}