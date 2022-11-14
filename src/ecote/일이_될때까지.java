package ecote;

import java.util.Scanner;

/**
 * 어떠한 수 N이 1이 될 때 까지 다음의 두 과정 중 하나를 반복적으로 선택하여 수행하려고 한다.
 * 단, 두 번째 연산은 N이 K로 나누어떨어질 떄만 선택할 수 있다.
 * <p>
 * 1. N에서 1을 뺀다.
 * 2. N을 K로 나눈다.
 * <p>
 * 예를 들어 N이 17, K가 4라고 가정하자. 이때 1번의 과정을 한 번 수행하면 N은 16이 된다.
 * 이후에 2번의 과정을 두 번 수행하면 N은 1이 된다. 결과적으로 이 경우 전체 과정을 실행한 횟수는 3이 된다.
 * 이는 N을 1로 만드는 최소 횟수이다.
 * N과 K가 주어질 때 N이 1이 될 때 까지 1번 혹은 2번의 과정을 수행해야 하는 최소 횟수를 구하는 프로그램을 작성하시오.
 */
public class 일이_될때까지 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int count = 0;

        if (N == 1) {
            System.out.println(1);
        }

        while (true) {
            if (N == 1) {
                System.out.println(count);
                break;
            }
            if (N % K == 0) {
                N /= K;
                count++;
                continue;
            }
            N -= 1;
            count++;
        }
    }
}
