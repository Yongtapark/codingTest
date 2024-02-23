import java.util.*;
import java.io.*;
class Solution {
    public int[] solution(String[] operations) {
        
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<operations.length;i++){
           String[] split = operations[i].split(" ");
            String order = split[0];
            String code = split[1];
            if(order.equals("I")){
                list.add(Integer.parseInt(code));
                Collections.sort(list);
            }
            if(order.equals("D") && code.equals("1") &&!list.isEmpty()){
                list.remove(list.size()-1);
            }
            if(order.equals("D")&&code.equals("-1")&&!list.isEmpty()){
                list.remove(0);
            }
        }
        int min = 0;
        int max = 0;
        if(!list.isEmpty()){
             min = list.get(0);  
             max = list.get(list.size()-1);
        }
        
        int[] answer = {max,min};
        
        
        return answer;
    }
}