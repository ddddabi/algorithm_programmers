import java.util.*;

class Solution {
    public long solution(long n) {
        // 1. 숫자를 문자열로 변환
        String s = String.valueOf(n);

        // 2. 문자 배열로 변환
        char[] arr = s.toCharArray();

        // 3. 정렬 (오름차순)
        Arrays.sort(arr);

        // 4. 뒤에서부터 이어 붙이기 (내림차순)
        StringBuilder sb = new StringBuilder();
        for (int i = arr.length - 1; i >= 0; i--) {
            sb.append(arr[i]);
        }

        // 5. 다시 숫자로 변환
        return Long.parseLong(sb.toString());
    }
}
