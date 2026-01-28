class Solution {
    public long solution(long n) {
        long x = (long) Math.sqrt(n);

        // 제곱수인지 판별
        if (x * x == n) {
            return (x + 1) * (x + 1);
        }

        return -1;
    }
}
