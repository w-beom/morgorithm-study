package ecote;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * 입력 조건
 * - 첫째 줄에 숫자 카드들이 놓인 행의 개수 N과 열의 개수 M이 공백을 기준으로 하여 각각 자연수로 주어진다. (1 <= N, M <= 100)
 * - 둘째 줄부터 n개의 줄에 걸쳐 각 카드에 적힌 숫자가 주어진다. 각 숫자는 1 이상 10,000 이하의 자연수이다.
 * 출력 조건
 * - 첫째 줄에 게임의 룰에 맞게 선택한 카드에 적힌 숫자를 출력한다.
 * 입력 예시 1
 * 3 3
 * 3 1 2
 * 4 1 4
 * 2 2 2
 * 출력 예시 1
 * 2
 * <p>
 * 입력 예시 2
 * 2 4
 * 7 3 1 8
 * 3 3 3 4
 * 출력 예시 2
 * 3
 */
public class 숫자_카드_게임 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        Integer[][] array = new Integer[N][M];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                array[i][j] = sc.nextInt();
            }
        }
        int maxValue = Integer.MIN_VALUE;
        for (int i = 0; i < N; i++) {
            int minValue = Integer.MAX_VALUE;
            for (int j = 0; j < M; j++) {
                minValue = Math.min(minValue, array[i][j]);
            }
            maxValue = Math.max(maxValue, minValue);
        }

        System.out.println(maxValue);
    }
}
