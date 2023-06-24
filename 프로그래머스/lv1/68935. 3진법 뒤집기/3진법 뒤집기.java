class Solution {
    public int solution(int n) {
        int answer= 0;
        String step1 = Integer.toString(n,3);
        String step2 = new StringBuilder(step1).reverse().toString();
        return Integer.parseInt(step2,3);
    }
}