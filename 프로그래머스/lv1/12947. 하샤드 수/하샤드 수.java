import java.util.*;
class Solution {
    public boolean solution(int x) {
                //x를 문자열로 변환 "18"
                //""를 기준으로 스플릿 ["1","8"]
                //문자를 숫자로 변환 [1,8]
                //서로 더함 9
                //기존의 18(x) 와 나누었을때 0이 되면 true
                boolean answer = true;
                String[] split = String.valueOf(x).split("");
                int temp=0;
                int[] ints = Arrays.asList(split).stream().mapToInt(Integer::parseInt).toArray();
                for (int anInt : ints) {
                    temp+=anInt;
                }
                if(x%temp==0){
                    return true;
                }else {
                    return false;
                }
            }
}