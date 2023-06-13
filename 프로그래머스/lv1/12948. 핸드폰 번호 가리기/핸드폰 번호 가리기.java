import java.util.*;
class Solution {
    public String solution(String phone_number) {
                char [] arr = new char [phone_number.length()];
                for(int i=0; i< phone_number.length();i++){
                    arr[i] =phone_number.charAt(i);
                }
                for(int i=0; i< phone_number.length()-4;i++){
                    arr[i] = '*';
                }
                System.out.println(arr);
                String answer = new String(arr);

                return answer;
            }
}