class Solution {
    public int solution(int num) {
        long n = num;
        int cnt = 0;
        for(int i = 0; i<500; i++){
            if(n == 1){
                return cnt;
            }
            
            if(n % 2 == 0){
                n = n / 2;
            }else{
                n = n * 3 + 1;
            }
            cnt++;
        }
        return -1;
    }
}