import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        HashSet<String> hashSet = new HashSet<>();
        String sentence = br.readLine();

        for (int i = 0; i < sentence.length(); i++) {
            for (int j = i+1; j < sentence.length()+1; j++) {
                hashSet.add(sentence.substring(i,j));
            }
        }

        bw.write(hashSet.size() + "\n");
        bw.flush();
        bw.close();
        br.close();
    }
}
