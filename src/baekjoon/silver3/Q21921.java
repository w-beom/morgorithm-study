package baekjoon.silver3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * 블로그
 * https://www.acmicpc.net/problem/21921
 */
public class Q21921 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] s = br.readLine().split(" ");

        int N = Integer.parseInt(s[0]);
        int X = Integer.parseInt(s[1]);
        String[] s1 = br.readLine().split(" ");
        int[] days = new int[N];

        for (int i = 0; i < days.length; i++) {
            days[i] = Integer.parseInt(s1[i]);
        }

        int end = X - 1;
        int count = 1;
        int sum = 0;
        for (int i = 0; i <= end; i++) {
            sum += days[i];
        }

        int max = sum;
        int start = 0;
        while (true) {
            if (end == days.length - 1) {
                break;
            }
            sum -= days[start++];
            sum += days[++end];
            if (Math.max(sum, max) > max) {
                max = sum;
                count = 1;
                continue;
            }
            if (max == sum) {
                count++;
            }
        }

        if (max == 0) {
            bw.write("SAD");
        } else {
            bw.write(max + "\n" + count);
        }
        bw.flush();
        bw.close();
    }
}
