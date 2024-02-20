import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String N = br.readLine();
        String[] split = N.split("");

        int[] numbers = new int[10];



        for (int i = 0; i < split.length; i++) {
            numbers[Integer.parseInt(split[i])]++;
        }

        for(int i=9;i>-1;i--){
            if(numbers[i]!=0){
                for(int j=0; j<numbers[i];j++){
                    bw.write(i+"");
                }
            }
        }
        bw.flush();
    }
}
