import java.util.*;
class Solution {
    public String solution(String s) {
        String answer = "";
        char[] sArray = s.toCharArray();
        char[] answerArr = new char[sArray.length];
        Arrays.sort(sArray);
        for(int i=0; i<sArray.length;i++){
            answer +=sArray[sArray.length-1-i];
        }
        return answer;
    }
}