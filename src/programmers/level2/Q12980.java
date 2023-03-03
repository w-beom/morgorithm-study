package programmers.level2;

/*
 * 점프와 순간이동
 * https://school.programmers.co.kr/learn/courses/30/lessons/12980
 * */
public class Q12980 {
    public static void main(String[] args) {
        int n = 6;
        System.out.println(solution(n));
    }

    private static int solution(int n) {
        int move = 1; // 지나온 거리
        while (move * 2 < n) {
            move *= 2;
        }

        return (n - move) + 1;
    }
}
