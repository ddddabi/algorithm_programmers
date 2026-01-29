class Solution {
    public String solution(int[] food) {
        StringBuilder left = new StringBuilder();
        
        // 1번 음식 부터
        for(int i = 0; i < food.length; i++){
            int cnt = food[i] / 2;
            for(int j = 0; j < cnt; j++){
                left.append(i);
            }
        }
        
        // 가운데에 0(물) 넣고, 오른쪽 넣기
        StringBuilder answer = new StringBuilder();
        answer.append(left);
        answer.append('0');
        answer.append(left.reverse());
        
        return answer.toString();
    }
}