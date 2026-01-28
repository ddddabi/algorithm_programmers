class Solution {
    public int solution(int n) {
        StringBuilder sb = new StringBuilder();

        // 1. 10진수 → 3진수 (거꾸로 저장됨)
        while (n > 0) {
            sb.append(n % 3);
            n /= 3;
        }

        // 2. 뒤집힌 3진수를 10진수로 변환
        int answer = 0;
        int pow = 1;

        for (int i = sb.length() - 1; i >= 0; i--) {
            answer += (sb.charAt(i) - '0') * pow;
            pow *= 3;
        }

        return answer;
    }
}
