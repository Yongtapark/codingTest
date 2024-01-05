class Solution {
    boolean solution(String s) {
        boolean answer = false;
        int cnt = 0;

        char[] tmp = s.toCharArray();
        
        for(int i=0;i<tmp.length;i++){
            if(tmp[i]=='('){
                cnt ++;
            }else{
                cnt --;
            }
            if(cnt<0){
                return false;
            }
            
        }
        if(cnt ==0){
            answer = true;
        }else{
            answer = false;
        }

        return answer;
    }
}