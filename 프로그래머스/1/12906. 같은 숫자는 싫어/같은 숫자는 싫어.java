import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        List<Integer> answer = new ArrayList<>();
        int tmpNum = 10;
        for(int i=0;i<arr.length;i++){
            if (tmpNum != arr[i]) {
                tmpNum = arr[i];
                answer.add(arr[i]);
            }
        }
        int[] answerArr = new int[answer.size()];
        for(int i =0; i<answer.size();i++){
            answerArr[i]=answer.get(i);
        }

        return answerArr;
    }    
}