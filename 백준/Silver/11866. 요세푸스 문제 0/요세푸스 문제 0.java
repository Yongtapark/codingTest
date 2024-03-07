import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        ArrayDeque<Integer> people = new ArrayDeque<>();
        int num = 1;
        for (int i = 0; i < n; i++) {
            people.addLast(num++);
        }

        int kill = k - 1;
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < k; j++) {
                Integer first = people.removeFirst();
                if (j != k - 1) {
                    people.addLast(first);
                } else {
                    list.add(first);
                }
            }

        }
        System.out.print("<");
        for (int i = 0; i < list.size(); i++) {
            if(i!=list.size()-1){
                System.out.print(list.get(i)+", ");
            }else{
                System.out.print(list.get(i));
            }
        }
        System.out.print(">");





    }
}
