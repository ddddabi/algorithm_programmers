class Solution {
    public int solution(int x) {
        int sum = 0;
        int temp = x; // 원본
        
        while (temp > 0) {
            sum += temp % 10;
            temp /= 10;
        }

        return sum;
    }
}