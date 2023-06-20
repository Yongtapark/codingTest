import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        String stars = IntStream.range(0, a).mapToObj(i -> "*").collect(Collectors.joining(""));
        IntStream.range(0, b).forEach(i -> System.out.println(stars));
    }
}