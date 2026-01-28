class Solution {
    public long solution(int price, int money, int count) {
        long answer = 0;
        long a = 0;
        
        for(int i = 1; i <= count; i++){
            a += price * i;
        }
        
        answer = a - money;
        
        if(answer < 0){
            return 0;
        }
            
        return answer;
    }
}