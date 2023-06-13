class Solution {
    public int solution(int num) {
                //만약 짝수라면 2로 나눈다.
                //만약 홀수라면 3을 곱하고 +1 한다.
                //이 공식의 반환이 1이될때까지 반복한다.
                //1이 될때 까지의 과정을 카운트한다.
                int answer = 0;
                long intToLong = num;
                while(intToLong!=1){
                    answer++;
                    if(intToLong % 2 ==0){
                        intToLong = intToLong/2;
                    }else{
                        intToLong= intToLong*3+1;
                    }
                    if(answer>=500){
                        answer=-1;
                        break;
                    }
                }
                return answer;
            }
}