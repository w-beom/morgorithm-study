package programmers.level2;

import java.util.Arrays;

/**
 * H-Index
 */
public class Q42747 {
    public static void main(String[] args) {
        int[] citations = {0, 0, 0, 0, 0};
        int answer = solution(citations);
        System.out.println("answer = " + answer);
    }

    private static int solution(int[] citations) {
        Arrays.sort(citations);
        int hIndex = citations.length;

        for (int i = 0; i < citations.length; i++) {
            hIndex = citations.length - i;
            if (citations[i] >= hIndex) {
                break;
            }
            if (i == citations.length - 1 && hIndex == 1) {
                return 0;
            }
        }

        return hIndex;
    }
}
