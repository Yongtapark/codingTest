import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] nums = new int[9];
        int maxNum = 0;
        int order =0;
        for (int i = 0; i<nums.length; i++) {
            nums[i] = Integer.parseInt(bf.readLine());
            if (nums[i]>maxNum) {
                maxNum = nums[i];
                order = i+1;
            }
        }
        bw.write(maxNum+"\n"+order+"\n");
        bw.flush();

    }
}