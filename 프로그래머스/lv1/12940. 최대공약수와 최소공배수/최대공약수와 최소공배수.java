class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];

        int gcd = findGCD(n, m);
        int lcm = (n * m) / gcd;

        answer[0] = gcd;
        answer[1] = lcm;
        return answer;
    }

    public int findGCD(int a, int b) {
        if (b == 0)
            return a;
        else
            return findGCD(b, a % b);
    }
}