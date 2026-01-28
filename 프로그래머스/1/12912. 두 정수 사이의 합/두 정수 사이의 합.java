class Solution {
    public long solution(int a, int b) {
        long answer = 0;

        // a <= b 로 정렬
        if (a > b) {
            int temp = a;
            a = b;
            b = temp;
        }

        // 합 더하기 (b 포함)
        for (int i = a; i <= b; i++) {
            answer += i;
        }

        return answer;
    }
}
