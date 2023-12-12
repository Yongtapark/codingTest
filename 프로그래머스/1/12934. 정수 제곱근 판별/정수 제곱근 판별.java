class Solution {
    public long solution(long n) {
        long answer = 0;
        long sqrt =(long)Math.sqrt(n);
        System.out.println(sqrt);
        if(sqrt * sqrt == n){
            answer = sqrt+1;
            answer =answer*answer;
            return answer;
        }else{
            return -1;
        }
    }
}