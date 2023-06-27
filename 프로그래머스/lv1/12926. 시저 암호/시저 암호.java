class Solution {
   public String solution(String s, int n) {
        String answer = "";
        char[] chars = s.toCharArray();
        for(int i=0; i<chars.length;i++){
            int charToInt = chars[i]+n;
            int i1 = charToInt - 26;
            if('A'<= chars[i]&&'Z'>=chars[i]) {
                if (charToInt > 'Z') {
                    chars[i] = (char) i1;
                }else {
                    chars[i] = (char) charToInt;
                }
            }

            if('a'<=chars[i]&&'z'>=chars[i]){
                if (charToInt>'z'){
                    chars[i] = (char) i1;
                }else{
                    chars[i] = (char) charToInt;
                }
            }
        }
        answer = new String(chars);
        return answer;
    }
}