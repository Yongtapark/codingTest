import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> inputs = new ArrayList<>();
        int T = scanner.nextInt();
        for (int i = 0; i < T*2; i++) {
            inputs.add(scanner.nextInt());
        }

        for(int i=0;i<inputs.size();i+=2){
            Integer first = inputs.get(i);
            Integer second = inputs.get(i + 1);
            System.out.println(first+second);
        }


    }
}