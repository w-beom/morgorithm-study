package baekjoon.silver4;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 * https://www.acmicpc.net/problem/11508
 */
public class Q11508 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Integer[] arr = new Integer[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr, Collections.reverseOrder());

        long answer = 0;
        for (int i = 0; i < arr.length; i++) {
            if ((i + 1) % 3 == 0) {
                continue;
            }
            answer += arr[i];
        }

        System.out.println(answer);
    }
}
