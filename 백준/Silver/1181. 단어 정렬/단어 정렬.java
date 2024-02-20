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
            for(int j =i+1; j<N;j++){
                if(strArr[i].equals(strArr[j])){
                    strArr[j] = "-1";
                }
            }
        }


        for(int i=0;i<N;i++){
            if(!strArr[i].equals("-1")){
                System.out.println(strArr[i]);
            }
        }
        bw.flush();
    }
}
