import java.util.*;
import java.util.stream.*;
class Solution {
    public boolean solution(String s) {
        if(s.length() == 4 || s.length()== 6){

            try{
                Stream.of(s).mapToInt(Integer::parseInt).toArray();
            return true;
            }catch (NumberFormatException e){
                return false;
            }
        }
                return false;
            }}