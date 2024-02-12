import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String unParsedStandard = bf.readLine().split(" ")[1];
        int standard = Integer.parseInt(unParsedStandard);
        String unParsedNum = bf.readLine();
        String[] unParsedNumArr = unParsedNum.split(" ");
        
        for(int i=0;i<unParsedNumArr.length;i++){
            if(Integer.parseInt(unParsedNumArr[i])<standard){
                bw.write(unParsedNumArr[i]+" ");
            }
        }
        
        bw.flush();
    }
}