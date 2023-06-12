class Solution {
           
            public int[] solution(long n) {
                String longToStr = String.valueOf(n);
                int[] answer = new int [longToStr.length()];
                int[] sol=new int [answer.length];
                for(int i=0; i<answer.length;i++){
                    char charTo= longToStr.charAt(i);
                    int numericValue = Character.getNumericValue(charTo); // 문자열 -> 숫자 변경
                    answer[i]=numericValue;
                }
                for (int i = answer.length - 1, j = 0; i >= 0; i--, j++) {
                    sol[j]=answer[i];
                }
                return sol;
            }
            
        }