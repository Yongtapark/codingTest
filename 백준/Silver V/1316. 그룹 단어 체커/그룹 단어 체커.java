import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int lineCount = Integer.parseInt(br.readLine());
        int count = 0;
        for (int i = 0; i < lineCount; i++) {
            String sentence = br.readLine();
            if (isGroup(sentence)) {
                count++;
            }


        }
        bw.write(count+"\n");

        bw.flush();
    }

    private static boolean isGroup(String sentence) {
        boolean[] visited = new boolean[26];
        char[] c = sentence.toCharArray();
        int prev = -1;
        for (int i = 0; i < c.length; i++) {
            if (prev != c[i]) {
                if (!visited[c[i] - 'a']){
                    visited[c[i]-'a'] = true;
                    prev = c[i];
                }else {
                    return false;
                }
            }
        }
        return true;
    }
}