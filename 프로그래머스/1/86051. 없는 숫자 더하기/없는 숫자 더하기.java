import java.util.*;
class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        int[] numberArr = {1,2,3,4,5,6,7,8,9}; 
        List<Integer> list = new ArrayList<>();    
        for(int i=0;i<numbers.length;i++){
            list.add(numbers[i]);
        }
        
        System.out.println(list);
        
        for(int i= 0; i<numberArr.length;i++){
            if(!list.contains(numberArr[i])){
                answer += numberArr[i];
            }
        }
        return answer;
    }
}