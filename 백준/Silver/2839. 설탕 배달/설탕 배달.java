import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int count = getCount(N);
        System.out.println(count);
    }

    private static int getCount(int N) {
        for(int i = 0; i< N; i++){
            for(int j = 0; j< N; j++){
                if(N -(i*3)-(j*5)==0){
                    return (i+j);
                }
            }
        }
        return -1;
    }
}
