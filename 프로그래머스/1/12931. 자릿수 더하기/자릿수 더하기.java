import java.util.*;

public class Solution {
    public int solution(int n) {
        while(n!=0){
            return n % 10 + solution(n / 10);
        }
        return n;
    }
}