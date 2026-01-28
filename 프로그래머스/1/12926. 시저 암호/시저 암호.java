class Solution {
    public String solution(String s, int n) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            // 공백은 그대로
            if (c == ' ') {
                sb.append(' ');
            }
            // 대문자
            else if (Character.isUpperCase(c)) {
                char shifted = (char) ((c - 'A' + n) % 26 + 'A');
                sb.append(shifted);
            }
            // 소문자
            else if (Character.isLowerCase(c)) {
                char shifted = (char) ((c - 'a' + n) % 26 + 'a');
                sb.append(shifted);
            }
        }

        return sb.toString();
    }
}
