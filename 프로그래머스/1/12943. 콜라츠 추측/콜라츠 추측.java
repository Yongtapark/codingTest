class Solution {
    public int solution(int num) {
        long n = (long)num; 
        int answer = 0;
        int count =0;
        while(n!=1){
            count++;
            if(count>500){
                return -1;
            }
            if(n%2==0){
                n = n/2;
            }else{
                n=n*3+1;
            }
        }
              answer=count;
        return answer;
    }
}