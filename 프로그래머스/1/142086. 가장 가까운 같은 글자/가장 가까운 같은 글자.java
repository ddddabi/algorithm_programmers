import java.util.Arrays;

class Solution {
    public int[] solution(String s) {
        int n = s.length();
        int[] answer = new int[n];

        int[] last = new int[26]; // 소문자 크기만큼
        Arrays.fill(last, -1); // 처음엔 모두 "등장한 적 없음"

        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            int idx = c - 'a';

            if (last[idx] == -1) {
                answer[i] = -1;
            } else {
                answer[i] = i - last[idx];
            }

            last[idx] = i; // 현재 위치로 갱신
        }

        return answer;
    }
}
