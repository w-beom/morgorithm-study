package programmers.level2;

import java.util.PriorityQueue;
import java.util.Queue;

public class Q42626 {
    public static void main(String[] args) {
        int[] scoville = {1, 2, 3, 9, 10, 12};
        int K = 7;

        int answer = solution(scoville, K);
        System.out.println("answer = " + answer);
    }

    private static int solution(int[] scoville, int K) {
        Queue<Integer> queue = new PriorityQueue<>();

        for (int j : scoville) {
            queue.add(j);
        }


        int answer = 0;

        while (queue.peek() < K) {
            if (queue.size() < 2) {
                return -1;
            }
            int a = queue.poll();
            int b = queue.poll();

            int newScoville = a + (b * 2);
            queue.add(newScoville);
            answer++;
        }

        return answer;
    }
}
