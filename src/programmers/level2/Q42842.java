package programmers.level2;

import java.util.Arrays;

/**
 * 카펫
 */
public class Q42842 {
    public static void main(String[] args) {
        int brown = 24;
        int yellow = 24;
        int[] solution = solution(brown, yellow);
        System.out.println(Arrays.toString(solution));
    }

    public static int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int width = (brown / 2) - 1;
        int height = 1;
        while (true) {
            int yellowCount = (width - 2) * height;
            if (yellow == yellowCount) {
                answer[0] = width;
                answer[1] = height + 2;
                break;
            }
            width--;
            height++;
        }
        return answer;
    }
}
