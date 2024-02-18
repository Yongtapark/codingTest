import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());


        int a1 = Integer.parseInt(st.nextToken());
        int a0 = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(br.readLine());
        int n0 = Integer.parseInt(br.readLine());
        int answer =0;
        for(int i=n0; i<100+1;i++){
            int fn = (a1*i) +a0;
            boolean isTrue = fn<=c*i;
            if(isTrue){
                answer = 1;
            }else {
                answer =0;
                break;
            }
        }
        System.out.println(answer);






    }


}


