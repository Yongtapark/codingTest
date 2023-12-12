import java.util.*;

class Solution {
    public long solution(long n) {
        String str = String.valueOf(n);
        char[] charArray = str.toCharArray();
        char[] list = String.valueOf(n).toCharArray();
        Arrays.sort(list);

        StringBuilder sb = new StringBuilder();
        for (char c : list) sb.append(c);

        return Long.parseLong(sb.reverse().toString());
    }
}