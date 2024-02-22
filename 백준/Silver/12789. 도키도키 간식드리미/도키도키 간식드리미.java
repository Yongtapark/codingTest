import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        int count = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int waitTurn = 1;
        Stack<Integer> tempWaitLine = new Stack<>();
        for (int i = 0; i < count; i++) {
            int turn = Integer.parseInt(st.nextToken());
            waitTurn = searchFromTempWait(tempWaitLine, waitTurn);
            if (turn == waitTurn) {
                waitTurn++;
            } else {
                tempWaitLine.push(turn);
            }
            waitTurn = searchFromTempWait(tempWaitLine, waitTurn);

        }

        if (tempWaitLine.isEmpty()) {
            sb.append("Nice").append("\n");
        } else {
            sb.append("Sad").append("\n");
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();

    }

    private static int searchFromTempWait(Stack<Integer> tmpLine, int waitTurn) {
        while (!tmpLine.isEmpty()) {
            if (waitTurn == tmpLine.peek()) {
                tmpLine.pop();
                waitTurn++;
            } else {
                break;
            }

        }
        return waitTurn;
    }

}


