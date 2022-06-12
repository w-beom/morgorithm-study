package baekjoon;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Q1026 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Integer[] A = new Integer[N];
        Integer[] B = new Integer[N];

        for (int i = 0; i < A.length; ++i) {
            A[i] = sc.nextInt();
        }

        for (int i = 0; i < A.length; ++i) {
            B[i] = sc.nextInt();
        }

        Arrays.sort(A);
        Arrays.sort(B, Collections.reverseOrder());

        int result = 0;
        for (int i = 0; i < N; ++i) {
            result += A[i] * B[i];
        }

        System.out.println(result);
    }
}
