package baekjoon.silver5;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * 거스름돈
 * https://www.acmicpc.net/problem/14916
 */
public class Q14916 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int answer = 0;
        while (N > 0) {
            if (N % 5 == 0) {
                N -= 5;
            } else {
                N -= 2;
            }
            answer++;
        }
        if (N == 0) {
            System.out.println(answer);
        } else {
            System.out.println(-1);
        }
    }
}
