class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;

        while (n >= a) {
            int exchanged = n / a;        // 교환 가능한 묶음 수
            int get = exchanged * b;      // 이번에 받는 콜라 수
            answer += get;

            n = (n % a) + get;            // 남은 빈 병 + 새로 생긴 빈 병
        }

        return answer;
    }
}
