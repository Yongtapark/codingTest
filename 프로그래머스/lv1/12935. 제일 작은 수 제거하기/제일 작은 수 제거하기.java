import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        if (arr.length == 1) return new int[]{-1}; // 배열의 길이가 1이면 -1을 반환

        int min = Arrays.stream(arr).min().getAsInt(); // 배열에서 최소값 찾기
        return Arrays.stream(arr).filter(i -> i != min).toArray(); // 최소값을 제외하고 새 배열 생성
    }
}