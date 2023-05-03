package baekjoon.silver5;

import java.util.Scanner;

/**
 * 폴리오미노
 * https://www.acmicpc.net/problem/1343
 */
public class Q1343 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String A = "AAAA";
        String B = "BB";

        str = str.replaceAll("XXXX", A);
        str = str.replaceAll("XX", B);

        if (str.contains("X")) {
            System.out.println(-1);
        } else {
            System.out.println(str);
        }
    }
}
