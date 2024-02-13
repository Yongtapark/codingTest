import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] split = br.readLine().split("");
        int isPalindrome = 0;
        for (int i=0; i<split.length;i++){
            if(split[i].equals(split[split.length-i-1])){
                isPalindrome = 1;
            }else{
                isPalindrome = 0;
                break;
            }
        }
        bw.write(isPalindrome+"\n");
        bw.flush();
    }
}