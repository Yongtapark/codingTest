import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        HashMap<String, Double> hashMap = new HashMap<>();
        hashMap.put("A+",4.5);
        hashMap.put("A0",4.0);
        hashMap.put("B+",3.5);
        hashMap.put("B0",3.0);
        hashMap.put("C+",2.5);
        hashMap.put("C0",2.0);
        hashMap.put("D+",1.5);
        hashMap.put("D0",1.0);
        hashMap.put("F",0.0);

        double subjectMultiplyPoint =0;
        double totalPoint =0;
        for(int i=0;i<20;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            st.nextToken();
            double point = Double.parseDouble(st.nextToken());
            String grade = st.nextToken();
            if(!grade.equals("P")){
                subjectMultiplyPoint += point*hashMap.get(grade);
                totalPoint += point;
            }

        }
        double totalAverage = subjectMultiplyPoint/totalPoint;
        bw.write(totalAverage+"\n");


        bw.flush();
    }
}