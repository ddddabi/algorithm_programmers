import java.util.*;

class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        PriorityQueue<Integer> hall = new PriorityQueue<>(); // min-heap

        for (int i = 0; i < score.length; i++) {
            hall.offer(score[i]);

            if (hall.size() > k) {
                hall.poll(); // 상위 k개만 남기기
            }

            answer[i] = hall.peek(); // 명예의 전당 최하위 점수
        }

        return answer;
    }
}
