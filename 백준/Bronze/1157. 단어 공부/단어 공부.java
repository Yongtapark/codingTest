import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String upperCasedSentence = br.readLine().toUpperCase();
        int[] alphabets = new int[26];
        for (int i = 0; i < upperCasedSentence.length(); i++) {
            alphabets[upperCasedSentence.charAt(i) - 'A']++;
        }

        int max = -1;
        char answer = '?';
        for (int i = 0; i < alphabets.length; i++) {
            if (alphabets[i] > max) {
                max = alphabets[i];
                answer = (char) (i + 'A');
            } else if (alphabets[i] == max) {
                answer = '?';
            }
        }
        bw.write(answer + "\n");

        bw.flush();
    }
}