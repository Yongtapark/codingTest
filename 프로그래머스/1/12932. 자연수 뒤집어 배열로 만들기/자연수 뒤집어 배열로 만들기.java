import java.util.*;
class Solution {
    public int[] solution(long n) {
        List<Long> answerList = new ArrayList<>();
        addDigit(n,answerList);
        System.out.println(answerList);
        return answerList.stream().mapToInt(Long::intValue).toArray();
    }
    
    public void addDigit(long number,List<Long> answerList){
            if(number!=0){
                answerList.add(number%10);
                number = number/10;
                addDigit(number,answerList);
            }
        }
}