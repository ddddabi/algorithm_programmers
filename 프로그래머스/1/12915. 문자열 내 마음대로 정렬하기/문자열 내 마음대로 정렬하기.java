import java.util.*;

class Solution {
    public String[] solution(String[] strings, int n) {

        Arrays.sort(strings, new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                // 1. n번째 문자 비교
                if (a.charAt(n) != b.charAt(n)) {
                    return a.charAt(n) - b.charAt(n);
                }
                // 2. 같으면 사전순 비교
                return a.compareTo(b);
            }
        });

        return strings;
    }
}
