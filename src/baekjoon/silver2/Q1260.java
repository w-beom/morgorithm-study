package baekjoon.silver2;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * https://www.acmicpc.net/problem/1260
 */
public class Q1260 {
    static boolean visit[] = new boolean[10001];
    static int[][] nodes = new int[10001][10001];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int V = sc.nextInt();

        for (int i = 0; i < M; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            nodes[a][b] = nodes[b][a] = 1;
        }

        dfs(nodes[V], V);

        visit = new boolean[10001];
        System.out.println();

        bfs(nodes[V], V);
    }

    private static void dfs(int[] node, int a) {
        System.out.print(a + " ");
        visit[a] = true;
        for (int i = 0; i < node.length; i++) {
            if (!visit[i] && node[i] == 1) {
                dfs(nodes[i], i);
            }
        }
    }

    private static void bfs(int[] node, int v) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(v);

        while (!queue.isEmpty()) {
            Integer poll = queue.poll();
            visit[poll] = true;
            System.out.println(poll + " ");
            for (int i = 0; i < nodes[poll].length; i++) {
                if (!visit[i] && node[i] != 1) {
                    queue.offer(i);
                }
            }
        }
    }


}
