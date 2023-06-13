class Solution {
    //a와 b를 비교하여 사이값을 구한다.
    //모든 값을 더하여 리턴
    public long solution(int a, int b) {
        long answer = 0;
            if(a<b){
                for(int x=a; x<=b;x++){
                answer+=x;
            }
            }else{
                  for(int x=b; x<=a; x++){
                answer+=x;
            }
            }
        return answer;
    }
}