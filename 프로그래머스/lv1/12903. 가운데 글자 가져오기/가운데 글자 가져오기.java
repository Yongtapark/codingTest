import java.util.*;
class Solution {
   public String solution(String s) {
                //s의 짝수/홀수를 구분
                //s의 가운데 위치를 구분
                String answer = "";
                StringBuilder stringbuilder = new StringBuilder(s);
                String[] split = s.split("");
                if(split.length%2!=0){
                        int i1 = (split.length - 1) / 2;
                    return split[i1];

                }else{
                    int i = split.length / 2;
                    return split[i-1]+split[i];
                
            }
}
}