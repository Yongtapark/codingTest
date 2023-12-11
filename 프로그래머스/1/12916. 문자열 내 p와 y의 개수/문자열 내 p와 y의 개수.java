class Solution {
    boolean solution(String s) {
        boolean answer = true;
        char[] temp = s.toLowerCase().toCharArray();
        int countP = 0;
        int countY = 0;
        for(int i=0;i<temp.length;i++){
            if(temp[i]=='p'){
                countP++;
            }
            if(temp[i]=='y'){
                countY++;
            }
        }
        if(countP!=countY){
            answer = false;
        }

        return answer;
    }
}