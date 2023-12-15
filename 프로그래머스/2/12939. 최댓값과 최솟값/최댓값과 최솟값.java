import java.util.*;
class Solution {
    public String solution(String s) {
        String answer = "";
        String[] tmpArr =s.split(" ");
        List<Integer> intList = new ArrayList<>();
        for(int i=0;i<tmpArr.length;i++){
            int num = Integer.parseInt(tmpArr[i]);
            intList.add(num);
        }
        int max =intList.get(0);
        int min =intList.get(0);
        for(int i=0;i<intList.size();i++){
            if(min>intList.get(i)){
                min = intList.get(i);
            }
            if(max<intList.get(i)){
                max =intList.get(i);
            }
        }
        answer= min+" "+max;
        return answer;
    }
}