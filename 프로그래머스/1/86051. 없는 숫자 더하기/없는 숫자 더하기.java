class Solution {
    public int solution(int[] numbers) {
        int answer = 45; // 0~9까지 합
        
        for(int n : numbers){
            answer -= n;
        }
        return answer;
    }
}