import java.util.*;

class Solution {
    public int solution(int a, int b, int c, int d) {
        int[] arr = {a, b, c, d};

        Map<Integer, Integer> cnt = new HashMap<>();
        for (int x : arr) cnt.put(x, cnt.getOrDefault(x, 0) + 1);

        int distinct = cnt.size();

        // 1) 네 개 모두 같음
        if (distinct == 1) {
            int p = arr[0];
            return 1111 * p;
        }

        // 2) 두 종류: (3+1) or (2+2)
        if (distinct == 2) {
            int p = 0, q = 0;
            int cp = 0, cq = 0;

            // 두 값과 각 count 꺼내기
            int idx = 0;
            int[] keys = new int[2];
            int[] vals = new int[2];
            for (Map.Entry<Integer, Integer> e : cnt.entrySet()) {
                keys[idx] = e.getKey();
                vals[idx] = e.getValue();
                idx++;
            }

            // (3+1)
            if (vals[0] == 3 || vals[1] == 3) {
                if (vals[0] == 3) { p = keys[0]; q = keys[1]; }
                else { p = keys[1]; q = keys[0]; }
                int x = 10 * p + q;
                return x * x;
            }

            // (2+2)
            int x = keys[0], y = keys[1];
            return (x + y) * Math.abs(x - y);
        }

        // 3) 세 종류: (2+1+1)
        if (distinct == 3) {
            int p = 0; // 2개 나온 값
            int q = 0, r = 0; // 1개씩 나온 값들

            for (Map.Entry<Integer, Integer> e : cnt.entrySet()) {
                if (e.getValue() == 2) p = e.getKey();
            }
            int t = 0;
            for (Map.Entry<Integer, Integer> e : cnt.entrySet()) {
                if (e.getKey() == p) continue;
                if (t == 0) q = e.getKey();
                else r = e.getKey();
                t++;
            }
            return q * r;
        }

        // 4) 네 종류: 모두 다름
        int min = 7;
        for (int x : arr) min = Math.min(min, x);
        return min;
    }
}