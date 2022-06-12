package baekjoon;

import java.util.Scanner;

public class Q2475 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int result = 0;

        for (int i = 0; i < 5; ++i) {
            int a = sc.nextInt();
            result = (int) ((double) result + Math.pow((double) a, 2.0D));
        }

        System.out.println(result % 10);
    }
}
