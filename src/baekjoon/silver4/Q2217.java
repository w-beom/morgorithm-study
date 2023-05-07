package baekjoon.silver4;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Q2217 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            list.add(sc.nextInt());
        }

        list.sort(Comparator.reverseOrder());

        int answer = Integer.MIN_VALUE;
        int ropeCount = 0;
        for (Integer number : list) {
            ropeCount++;
            answer = Math.max(answer, number * ropeCount);
        }

        System.out.println(answer);
    }
}
