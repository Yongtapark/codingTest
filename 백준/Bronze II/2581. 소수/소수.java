import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int M = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());

        ArrayList<Integer> decimals = new ArrayList<>();
        for (int i = M; i < N+1; i++) {
            int count = 0;
            for (int j = 1; j < i + 1; j++) {
                if (i % j == 0 && i > 1) {
                    count++;
                }
            }
            if (count == 2) {
               decimals.add(i);
            }
        }


        if(decimals.isEmpty()){
            decimals.add(-1);
        }else {
            int sum = 0;
            for(int i=0;i<decimals.size();i++){
                sum+=decimals.get(i);
            }
            bw.write(sum+"\n");
        }
        bw.write(decimals.get(0)+"\n");
        bw.flush();




    }
}