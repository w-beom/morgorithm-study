package programmers.level2;

public class Q87946 {
    public static boolean[] visit;
    public static int answer = 0;

    public static void main(String[] args) {
        int k = 80;
        int[][] dungeons = {{80, 20}, {50, 40}, {30, 10}};

        solution(k, dungeons);
        System.out.println("answer = " + answer);
    }

    private static void solution(int k, int[][] dungeons) {
        visit = new boolean[dungeons.length];
        dfs(k, dungeons, 0);
    }

    private static void dfs(int k, int[][] dungeons, int count) {
        for (int i = 0; i < dungeons.length; i++) {
            if (visit[i] || k < dungeons[i][0]) {
                continue;
            }
            visit[i] = true;
            dfs(k - dungeons[i][1], dungeons, count + 1);
            visit[i] = false;
        }
        answer = Math.max(answer, count);
    }
}
