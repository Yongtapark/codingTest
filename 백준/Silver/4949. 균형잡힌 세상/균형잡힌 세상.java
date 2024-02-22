import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        for (int i = 0; ; i++) {
            String problem = br.readLine();
            String[] split = problem.split("");
            if (split.length == 1 && split[0].equals(".")) {
                break;
            }
            if(split[split.length-1].equals(".")){
                String answer = getStackCheck(problem, split);
                bw.write(answer + "\n");
            }
        }
        bw.flush();
        bw.close();
        br.close();

    }

    private static String getStackCheck(String problem, String[] split) {
        Stack<String> stack = new Stack<>();
        String answer = "";
        for (int j = 0; j < problem.length(); j++) {
            if (split[j].equals("(")) {
                stack.push(split[j]);
            }
            if (split[j].equals("[")) {
                stack.push(split[j]);
            }
            if (split[j].equals(")")) {
                if (stack.isEmpty() || !stack.peek().equals("(")) {
                    return "no";
                }
                stack.pop();
            }
            if (split[j].equals("]")) {
                if (stack.isEmpty() || !stack.peek().equals("[")) {
                    return "no";
                }
                stack.pop();
            }
        }
        if (stack.isEmpty()) {
            answer = "yes";
        }else{
            answer = "no";
        }
        return answer;
    }

}


