import java.util.*;
class Solution {
    public int[] solution(int[] arr, int divisor) {
        int[] answer = {};
        List<Integer> list = new ArrayList<>();
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%divisor==0){
                list.add(arr[i]);
            }
        }
        if(list.size()==0){
            return new int[] {-1};
        }
        answer = new int[list.size()];
        for(int i=0; i<answer.length;i++){
            answer[i] = list.get(i);
        }
        Arrays.sort(answer);
        return answer;
    }
}