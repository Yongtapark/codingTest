import java.util.*;
class Solution
{
    public int solution(int []A, int []B)
    {
        int answer = 0;
        List<Integer> a = new ArrayList<>();
        List<Integer> b = new ArrayList<>();

        for(int i=0;i<A.length;i++){
            a.add(A[i]);
            b.add(B[i]);
        }
        //배열을 오름차순, 내림차순 으로 각각 정렬한 후 곱하면 답이 나온다.
        Collections.sort(a,Collections.reverseOrder());
        Collections.sort(b);
        //최댓값과 최솟값을 서로 곱하면 된다.
        
        
        
        for(int i=0;i<A.length;i++){
            answer += a.get(i) * b.get(i);
        }

        return answer;
    }
}