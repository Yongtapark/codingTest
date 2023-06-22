import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
            ArrayList<Integer> list = new ArrayList<>();
            
            for(int i=0; i<arr.length-1; i++) {
                if(arr[i] != arr[i+1]) {
                    list.add(arr[i]);
                }
            }

            // 마지막 요소는 항상 추가
            list.add(arr[arr.length-1]);

            // ArrayList를 배열로 변환
            int[] answer = list.stream().mapToInt(i -> i).toArray();

            return answer;
        }
}