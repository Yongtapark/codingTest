import java.util.*;

class Solution {
    public String solution(String s) {
      StringBuilder stringBuilder = new StringBuilder();
    int idx = 0;
    for (char c : s.toCharArray()) {
        if (c == ' ') {
            stringBuilder.append(c);
            idx = 0;
        } else {
            stringBuilder.append(idx % 2 == 0 ? Character.toUpperCase(c) : Character.toLowerCase(c));
            idx++;
        }
    }
    return stringBuilder.toString();
}
}