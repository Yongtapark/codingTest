import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        ArrayDeque<Integer> integers = new ArrayDeque<Integer>();
        int N = Integer.parseInt(br.readLine());
        for(int i=1;i<N+1;i++){
            integers.addFirst(i);
        }
        for(int i=0;i<N-1;i++){
            integers.removeLast();
            Integer e1 = integers.removeLast();
            integers.addFirst(e1);
        }
        System.out.println(integers.peek());

    }
}