class Solution {
    public int solution(int[] numbers, int target) {
        return dfs(numbers,0,0,target);
    }
    
    int dfs(int[] numbers, int index, int sum, int target ){
        if(index==numbers.length){
            return sum == target ? 1 : 0;
        }else{
          int plus = dfs(numbers, index+1, sum+numbers[index], target);
          int minus = dfs(numbers, index+1, sum-numbers[index], target);
        return plus + minus;
        }
    }
}