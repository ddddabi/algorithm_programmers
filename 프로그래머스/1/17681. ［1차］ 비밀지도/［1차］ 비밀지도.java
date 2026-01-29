class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];

        for (int i = 0; i < n; i++) {
            int row = arr1[i] | arr2[i]; // 1) 비트 OR

            // 2) n자리 2진 문자열(앞에 0 채우기)
            String bin = Integer.toBinaryString(row);
            if (bin.length() < n) {
                bin = "0".repeat(n - bin.length()) + bin;
            }

            // 3) 1->#, 0->공백
            bin = bin.replace('1', '#').replace('0', ' ');
            answer[i] = bin;
        }

        return answer;
    }
}
