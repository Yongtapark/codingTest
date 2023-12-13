class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        if(a<b){
            for(int i=a;a<=b;a++){
                answer +=(long)a;
            }    
        }else{
            for(int i=b;b<=a;b++){
                answer +=(long)b;
            }
        }
        
        return answer;
    }
}