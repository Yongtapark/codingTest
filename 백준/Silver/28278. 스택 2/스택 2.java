import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int count = Integer.parseInt(br.readLine());
        newStack newStack = new newStack();
        for (int i = 0; i < count; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int order = Integer.parseInt(st.nextToken());
            if (order == 1) {
                int val = Integer.parseInt(st.nextToken());
                newStack.push(val);
            } else if (order == 2) {
                sb.append(newStack.poll()).append("\n");
            } else if (order == 3) {
                sb.append(newStack.size()).append("\n");
            } else if (order == 4) {
                sb.append(newStack.isEmpty()).append("\n");
            } else if (order == 5) {
                sb.append(newStack.peek()).append("\n");
            }
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }

    static class newStack {
        private int[] arr = new int[1000000];
        private int size = 0;

        public void push(int num) {
            arr[size] = num;
            size++;
        }

        public int poll() {
            if (size == 0) {
                return -1;
            } else {
                int lastElement = arr[size - 1];
                arr[size] = 0;
                size--;
                return lastElement;
            }
        }

        public int peek() {
            if (size == 0) {
                return -1;
            }else {
                return arr[size - 1];
            }
        }

        public int size() {
            return size;
        }

        public int isEmpty() {
            if (size == 0) {
                return 1;
            } else {
                return 0;
            }
        }
    }


}


