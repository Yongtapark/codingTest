import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Integer.parseInt(bf.readLine());
        String unParsedNum = bf.readLine();
        int findNum = Integer.parseInt(bf.readLine());
        int count =0;
        String[] unParsedNumArr = unParsedNum.split(" ");
        for(int i=0;i<unParsedNumArr.length;i++){
            if(Integer.parseInt(unParsedNumArr[i])==findNum){
                count++;
            }
        }
        bw.write(count+"\n");
        bw.flush();
    }
}