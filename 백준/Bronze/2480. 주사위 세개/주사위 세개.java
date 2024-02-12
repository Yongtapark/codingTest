import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> dicePoint = new ArrayList<>();
        int count =0;
        int duplicateNum = 0;
        final int ALL_MATCH = 1;
        final int DOUBLE_MATCH = 2;

        for(int i=0;i<3;i++){
            dicePoint.add(scanner.nextInt());
        }
        Collections.sort(dicePoint);

        HashSet<Integer> integers = new HashSet<>();
        for (int i=0;i<3;i++){
            if(integers.add(dicePoint.get(i))){
               count++;
            }else {
                duplicateNum=dicePoint.get(i);
            }
        }

        if(count==ALL_MATCH){
            System.out.println(10000+dicePoint.get(0)*1000);
        } else if (count==DOUBLE_MATCH) {
            System.out.println(1000+duplicateNum*100);
        }else {
            System.out.println(dicePoint.get(2)*100);
        }


    }
}