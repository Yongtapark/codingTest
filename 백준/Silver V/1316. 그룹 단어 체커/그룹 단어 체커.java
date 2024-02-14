import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int count = 0;

        for (int i = 0; i < n; i++) {
            String word = scanner.next();
            if (isGroupWord(word)) {
                count++;
            }
        }

        System.out.println(count);
    }

    public static boolean isGroupWord(String word) {
        boolean[] visited = new boolean[26];
        int prev = -1;

        for (char c : word.toCharArray()) {
            if (prev != c) {
                if (!visited[c - 'a']) {
                    visited[c - 'a'] = true;
                    prev = c;
                } else {
                    return false;
                }
            }
        }

        return true;
    }
}