import java.util.*;

class Solution {
    public int solution(int[] d, int budget) {
        // 1. 오름차순 정렬
        Arrays.sort(d);

        int cnt = 0;
        int sum = 0;

        // 2. 작은 금액부터 누적
        for (int i = 0; i < d.length; i++) {
            sum += d[i];

            // 예산 초과하면 중단
            if (sum > budget) {
                break;
            }

            cnt++;
        }

        return cnt;
    }
}
