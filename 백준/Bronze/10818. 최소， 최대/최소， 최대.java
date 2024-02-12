import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bf.readLine();
        String[] unParsedNums = bf.readLine().split(" ");
        ArrayList<Integer> nums = new ArrayList<>();
        
        for (int i=0; i<unParsedNums.length;i++){
            nums.add(Integer.parseInt(unParsedNums[i]));
        }
        
        Collections.sort(nums);
        bw.write(nums.get(0)+" "+nums.get(unParsedNums.length-1)+"\n");
        bw.flush();
    }
}