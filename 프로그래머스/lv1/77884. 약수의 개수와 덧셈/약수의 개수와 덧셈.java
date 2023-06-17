import java.util.*;
class Solution {
   public int solution(int left, int right) {
                int count=0;
                ArrayList<Integer> list = new ArrayList<>();
                for(int i=left; i<right+1;i++){
                    count = 0;
                    for(int j =1; j<i+1;j++){
                        if(i%j==0){
                            count++;
                        }
                    }
                    if(count%2!=0){
                        list.add(-i);
                    }else{
                        list.add(i);
                    }

                }
                return list.stream().mapToInt(Integer::intValue).sum();
            }
}