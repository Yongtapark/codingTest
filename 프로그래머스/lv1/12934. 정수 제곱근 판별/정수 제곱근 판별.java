class Solution {
   public long solution(long n) {
                long answer = 0;
                long sqrt = (long)Math.sqrt(n);
                for(int x=0;x<n;x++){
                    if(Math.pow(sqrt,2)==n){
                        return (long) Math.pow(sqrt+1,2);
                    }else{
                        answer = -1L;
                    }
                }
                return answer;
            }
}