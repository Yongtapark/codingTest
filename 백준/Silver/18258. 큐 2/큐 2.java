import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int count = Integer.parseInt(br.readLine());
        TempQueue tempQueue = new TempQueue();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < count; i++) {
            String[] split = br.readLine().split(" ");
            if (split.length == 2) {
                if (split[0].equals("push")) {
                    tempQueue.push(Integer.parseInt(split[1]));
                }
            } else {
                if (split[0].equals("pop")) {
                    sb.append(tempQueue.pop()).append("\n");
                }
                if (split[0].equals("size")) {
                    sb.append(tempQueue.size()).append("\n");
                }
                if (split[0].equals("empty")) {
                    sb.append(tempQueue.empty()).append("\n");
                }
                if (split[0].equals("front")) {
                    sb.append(tempQueue.front()).append("\n");
                }
                if (split[0].equals("back")) {
                    sb.append(tempQueue.back()).append("\n");
                }
            }
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}

class TempQueue {
    private int[] arr = new int[2000001];
    private int count = 0;
    private int start = 0;
    private int end = 0;

    public void push(int val) {
        arr[end] = val;
        checkPivot();
        end++;
        count++;
    }

    public int pop() {
        if (!isEmpty()) {
            int val = arr[start];
            checkPivot();
            start++;
            count--;
            return val;
        } else {
            return -1;
        }
    }

    public int size() {
        return count;
    }

    public int empty() {
        return count == 0 ? 1 : 0;
    }

    boolean isEmpty() {
        return count == 0;
    }

    public int front() {
        if (!isEmpty()) {
            return arr[start];
        } else {
            return -1;
        }
    }

    public int back() {
        if (!isEmpty()) {
            return arr[end-1];
        } else {
            return -1;
        }
    }

    public void checkPivot() {
        if (start == arr.length - 1) {
            start = -1;
        }
        if (end == arr.length - 1) {
            end = -1;
        }
       /* if ((start != 0 && end != 0) && start - end == 1 || end - start == 1) {
            System.out.println("Array is full!");
        }*/
    }


}
