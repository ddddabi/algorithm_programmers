class Solution {
    public int[] solution(int[] arr) {
        // 길이가 1이면 -1 반환
        if(arr.length == 1){
            return new int[]{-1};
        }
        
        // 1. 최솟값 찾기
        int min = arr[0];
        for(int i = 1; i < arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        
        // 2. 최솟값 제외한 배열 만들기
        int[] answer = new int[arr.length - 1];
        int idx = 0;
        
        for(int i =0; i<arr.length; i++){
            if(arr[i] != min){
                answer[idx++] = arr[i];
            }
        }
        return answer;
    }
}