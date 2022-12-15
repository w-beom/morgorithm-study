package programmers.level2;

/**
 * 숫자의 표현
 */
public class Q12924 {
    public static void main(String[] args) {
        int solution = solution(15);
        System.out.println(solution);
    }

    public static int solution(int n) {
        int startNumber = 1;
        int count = 0;
        while (startNumber <= n) {
            int number = startNumber;
            int sum = 0;
            while (sum < n) {
                sum += number++;
                if (sum == n) {
                    count++;
                    break;
                }
            }
            startNumber++;
        }
        return count;
    }
}
