package programmers.level2;

import java.util.Arrays;

public class Q12941 {
    public static void main(String[] args) {
        int[] arr = {1, 2};
        int[] arr2 = {3, 4};
        int solution = solution(arr, arr2);
        System.out.println(solution == 10);
    }

    public static int solution(int[] A, int[] B) {
        Arrays.sort(A);
        Arrays.sort(B);
        int answer = 0;
        for (int i = 0, j = B.length - 1; i < A.length; i++, j--) {
            answer += A[i] * B[j];
        }

        return answer;
    }
}
