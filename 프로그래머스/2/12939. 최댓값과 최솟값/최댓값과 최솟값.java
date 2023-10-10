class Solution {
    public String solution(String s) {
      String[] splittedString = s.split(" ");
                int max = Integer.MIN_VALUE;  // 초기 최대값을 최소로 설정
                int min = Integer.MAX_VALUE;  // 초기 최소값을 최대로 설정

                for (String str : splittedString) {
                    int number = Integer.parseInt(str);
                    if (number > max) {
                        max = number;
                    }
                    if (number < min) {
                        min = number;
                    }
                }

                return min + " " + max;
    }
}