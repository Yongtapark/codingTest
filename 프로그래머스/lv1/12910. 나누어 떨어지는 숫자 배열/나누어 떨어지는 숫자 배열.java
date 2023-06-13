import java.util.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        List<Integer> listAnswer = new ArrayList<>();
        for(int arrs : arr){
            if(arrs%divisor==0){
                listAnswer.add(arrs);
            }
        }
        if(listAnswer.isEmpty()){
            listAnswer.add(-1);
        }
        Collections.sort(listAnswer);
       int [] answer = listAnswer.stream().mapToInt(i->i).toArray();
        return answer;
    }
}