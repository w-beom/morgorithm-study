package ecote;

import java.util.*;

/**
 * 입력조건
 * - 첫째 줄에 N(2<= N <= 1000), M(1 <= M <= 10000), K(1 <= K<= 10000)의 자연수가 주어지며, 각 자연수는 공백으로 구분한다.
 * - 둘쨰 줄에 N개의 자연수가 주어진다. 각 자연수는 공백으로 구분한다. 단, 각각의 자연수는 1 이상 10000 이하의 수로 주어진다.
 * - 입력으로 주어지는 K는 항상 M보다 작거나 같다.
 * 출력조건
 * - 첫째줄에 동빈이의 큰 수의 법칙에 따라 더해진 답을 출력한다.
 * 입력 예시
 * - 5 8 3
 * - 2 4 5 4 6
 * 출력 예시
 * 46
 */
public class 큰_수의_법칙 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int K = sc.nextInt();
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            list.add(sc.nextInt());
        }

        Collections.sort(list);

        int first = list.get(N - 1);
        int second = list.get(N - 2);

        int result = 0;
        int count = K;
        for (int i = 0; i < M; i++) {
            if (count == 0) {
                count = K;
                result += second;
                continue;
            }
            result += first;
            count--;
        }

        System.out.println(result);
    }
}
