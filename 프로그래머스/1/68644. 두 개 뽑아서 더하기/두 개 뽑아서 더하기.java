import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        Set<Integer> set = new HashSet<>();

        // 1) 모든 두 수의 합을 set에 저장 (중복 제거)
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                set.add(numbers[i] + numbers[j]);
            }
        }

        // 2) set -> 배열
        int[] answer = new int[set.size()];
        int idx = 0;
        for (int v : set) {
            answer[idx++] = v;
        }

        // 3) 정렬
        Arrays.sort(answer);

        return answer;
    }
}
