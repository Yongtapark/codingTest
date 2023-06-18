import java.util.*;
import java.util.stream.Collectors;
class Solution {
     public String solution(String s) {
                String[] split = s.split("");
                List<String> collect = Arrays.stream(split).sorted().collect(Collectors.toList());
                Collections.reverse(collect);
                StringBuilder stringBuilder = new StringBuilder();
                for (String answer : collect) {
                    stringBuilder.append(answer);
                }
                return stringBuilder.toString();
            }
}
