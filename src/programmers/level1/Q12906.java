package programmers.level1;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;

public class Q12906 {
    public static void main(String[] args) {
        int[] arr = {1, 1, 3, 3, 0, 1, 1};

        int[] answer = solution(arr);
        System.out.println("answer = " + Arrays.toString(answer));
    }

    public static int[] solution(int[] arr) {
        Queue<Integer> queue = new ArrayDeque<>();
        for (int num : arr) {
            if (!queue.isEmpty() && ((ArrayDeque<Integer>) queue).peekLast() == num) {
                continue;
            }
            queue.add(num);
        }

        int[] answer = new int[queue.size()];

        for (int i = 0; i < answer.length; i++) {
            answer[i] = queue.poll();
        }
        return answer;
    }
}
