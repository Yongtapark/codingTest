import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        for(int i=0;i<N-1;i++){
            for(int j=N;j-i-1>0;j--){
                System.out.print(" ");
            }
            for(int j=0;j<i*2+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=N-1;i>=0;i--){
            for(int j=N-1;j-i>0;j--){
                System.out.print(" ");
            }
            for(int j=0;j<i*2+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}