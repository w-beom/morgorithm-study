package programmers.level2;

/**
 * 피보나치 수
 */
public class Q12945 {
    static int[] dp = new int[100001];

    public static void main(String[] args) {
        int solution = solution(5);
        System.out.println(solution);
    }

    public static int solution(int n) {
        dp[0] = 0;
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            dp[i] = (dp[i - 1] % 1234567) + (dp[i - 2] % 1234567);
        }
        return dp[n];
    }


}
