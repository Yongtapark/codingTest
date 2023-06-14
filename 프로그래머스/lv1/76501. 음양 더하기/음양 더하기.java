class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
        //solution 배열의 값을 확인한다.
        //만약 signs의 값이 true면 양수, false면 음수를 뜻한다.
        // 구해진 값을 모두 합해서 리턴    
        int answer = 0;
       // List<Integer> listAbsolutes = Arrays.asList(absolutes);
        for(int i=0; i<absolutes.length;i++){
            if(signs[i]==false){
                absolutes[i]=-absolutes[i];
            }
            answer += absolutes[i];
            
        }
        System.out.println(absolutes[1]);
        
        
        
        return answer;
    }
}