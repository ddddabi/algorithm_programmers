import java.util.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        ArrayList<Integer> list = new ArrayList<>();

        // 1. 나누어 떨어지는 값 모으기
        for (int n : arr) {
            if (n % divisor == 0) {
                list.add(n);
            }
        }

        // 2. 없으면 -1 반환
        if (list.size() == 0) {
            return new int[]{-1};
        }

        // 3. 오름차순 정렬
        Collections.sort(list);

        // 4. ArrayList → 배열
        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }
}
