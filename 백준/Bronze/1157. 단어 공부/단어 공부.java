import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sentenceArr = br.readLine().toUpperCase().split("");
        List<String> elements = Arrays.stream(sentenceArr).distinct().collect(Collectors.toList());

        HashMap<String, Integer> hashMap = new HashMap<>();
        for(int i=0;i<elements.size();i++){
            hashMap.put(elements.get(i),0);
        }
        for(int j=0;j<elements.size();j++){
            for(int i=0;i<sentenceArr.length;i++){
                if(sentenceArr[i].equals(elements.get(j))){
                    Integer count = hashMap.get(elements.get(j));
                    count++;
                    hashMap.put(elements.get(j),count);
                }
            }
        }

        int max=0;
        String sentence = null;
        for(int i=0;i<elements.size();i++){
            if(hashMap.get(elements.get(i))>max){
                max = hashMap.get(elements.get(i));
                sentence = elements.get(i);
            }
        }
        int cnt=0;
        for(int i=0;i<elements.size();i++){
           if(hashMap.get(elements.get(i))==max){
               cnt++;
           }
        }


        if(cnt==1){
            bw.write(sentence+"\n");
        }else {
            bw.write("?"+"\n");
        }


        bw.flush();
    }
}