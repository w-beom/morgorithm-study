    package baekjoon.silver4;

    import java.util.Arrays;
    import java.util.Scanner;

    public class Q1758 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int N = sc.nextInt();
            int[] arr = new int[N];

            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
            }

            Arrays.sort(arr);

            long answer = 0;
            int index = 1;
            for (int i = arr.length - 1; i >= 0; i--) {
                int tip = arr[i] - (index++ - 1);
                if (tip > 0) {
                    answer += tip;
                }
            }

            System.out.println(answer);
        }
    }
