import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] degree = new int[3];
        int degreeSum = 0;
        for(int i=0;i<3;i++){
            degree[i] = Integer.parseInt(br.readLine());
            degreeSum += degree[i];
        }

        if (degreeSum != 180) {
            bw.write("Error\n");
        } else if (degree[0] == degree[1] && degree[1] == degree[2]) {
            bw.write("Equilateral\n");
        } else if (degree[0] == degree[1] || degree[1] == degree[2] || degree[0] == degree[2]) {
            bw.write("Isosceles\n");
        } else {
            bw.write("Scalene\n");
        }

        
        bw.flush();


    }

}