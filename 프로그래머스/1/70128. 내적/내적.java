class Solution {
    public int solution(int[] a, int[] b) {
        int answer = 0;
        
        // 길이가 같은지 검증
        if(a.length != b.length){
            return 0;
        }
        
        // 배열 길이만큼 반복
        for(int i = 0; i<a.length; i++){
            // 같은 위치에 있는 숫자끼리 곱셈
            // 곱셈한 것을 answer에 누적 합
            answer += a[i] * b[i];
        }
        return answer;
    }
}