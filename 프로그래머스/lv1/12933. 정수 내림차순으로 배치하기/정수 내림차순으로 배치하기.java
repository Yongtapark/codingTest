class Solution {
    public long solution(long n) {
                long answer = 0;
                String longToStr = String.valueOf(n);
                long [] strToLongArr =  new long [longToStr.length()];
                for(int i=0; i<longToStr.length();i++){
                    strToLongArr[i]= Character.getNumericValue(longToStr.charAt(i));
                    System.out.println(strToLongArr[i]);
                }
                for(int i=0;i<longToStr.length()-1;i++){
                    for(int j=0; j<longToStr.length()-i-1;j++){
                        if(strToLongArr[j]<strToLongArr[j+1]){
                            long temp = strToLongArr[j];
                            strToLongArr[j] = strToLongArr[j+1];
                            strToLongArr[j+1]=temp;
                        }
                    }
                }
                //뒤집힌 strToLongArr 를 문자열로 변환 후 long 으로 변환?
                StringBuilder stringBuilder = new StringBuilder();
                for (long l : strToLongArr) {
                    stringBuilder.append(l);
                }
                
                return Long.parseLong(stringBuilder.toString());
            }
}