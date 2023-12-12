import java.util.*;

class Solution {
    public long solution(long n) {
        char[] charArray = String.valueOf(n).toCharArray();
        Arrays.sort(charArray);

        // 배열을 내림차순으로 뒤집습니다.
        String sortedStr = new StringBuilder(new String(charArray)).reverse().toString();

        // 문자열을 정수로 변환합니다.
        return Long.parseLong(sortedStr);
    }
}