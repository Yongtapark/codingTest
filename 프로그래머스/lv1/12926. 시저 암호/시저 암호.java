class Solution {
    public String solution(String s, int n) {
        StringBuilder result = new StringBuilder();

        for (char originalChar : s.toCharArray()) {
            if (Character.isUpperCase(originalChar)) {
                char shiftedChar = (char) ((originalChar - 'A' + n) % 26 + 'A');
                result.append(shiftedChar);
            } else if (Character.isLowerCase(originalChar)) {
                char shiftedChar = (char) ((originalChar - 'a' + n) % 26 + 'a');
                result.append(shiftedChar);
            } else {
                result.append(originalChar);
            }
        }

        return result.toString();
    }
}
