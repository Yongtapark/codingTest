import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        String[] strArr = new String[N];
        for(int i=0;i<N;i++){
            String sentence = br.readLine();
                strArr[i] = sentence;
        }
        Arrays.sort(strArr, (o1,o2)->{
            if(o1.length()==o2.length()){
               return o1.compareTo(o2);
            }
            return o1.length()-o2.length();
        });

        for(int i=0;i<N;i++){
            if(i!=0&&!strArr[i].equals(strArr[i-1])){
                bw.write(strArr[i]+"\n");
            } else if (i==0) {
                bw.write(strArr[i]+"\n");
            }
        }
        bw.flush();
    }
}
