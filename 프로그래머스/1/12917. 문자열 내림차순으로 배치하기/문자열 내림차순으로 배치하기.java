import java.util.*;

class Solution {
    public String solution(String s) {
        // 1. 문자열을 문자로 바꾸기
            char[] arr = s.toCharArray();
        
        // 2. 오름차순 정렬
        Arrays.sort(arr);
        
        // 3. 역순으로 문자열 만들기
        StringBuilder sb = new StringBuilder();
        for(int i = arr.length -1; i >= 0; i--){
            sb.append(arr[i]);
        }
        
        return sb.toString();
    }
}