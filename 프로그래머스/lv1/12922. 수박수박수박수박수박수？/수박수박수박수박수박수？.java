import java.util.*;
class Solution {
     public String solution(int n) {
                String[] answer =new String [n];
                for(int i=0;i<n;i++){
                  answer[i] = (i%2==0 ? "수" :  "박");
                }
                return String.join("",answer);
            }
}