class Solution {
   public boolean solution(int x) {
        int sumOfDigits = sumDigits(x);
        return x % sumOfDigits == 0;
    }

    private int sumDigits(int x) {
        int sum = 0;
        while (x > 0) {
            sum += x % 10;
            x /= 10;
        }
        return sum;
    }
}