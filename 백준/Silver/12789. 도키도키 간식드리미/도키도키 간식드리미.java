import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        Queue<Integer> queue = new LinkedList<>();
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < N; i++) {
            queue.offer(Integer.parseInt(st.nextToken()));
        }
        
        int waitingNumber = 1;
        while (!queue.isEmpty() || !stack.isEmpty()) {
            if (!queue.isEmpty() && queue.peek() == waitingNumber) {
                queue.poll();
                waitingNumber++;
            } else if (!stack.isEmpty() && stack.peek() == waitingNumber) {
                stack.pop();
                waitingNumber++;
            } else if (!queue.isEmpty()) {
                stack.push(queue.poll());
            } else {
                System.out.println("Sad");
                return;
            }
        }
        System.out.println("Nice");
    }
}
