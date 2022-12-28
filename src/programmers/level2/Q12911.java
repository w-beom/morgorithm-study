package programmers.level2;

/**
 * 다음 큰 숫자
 */
public class Q12911 {
    public static void main(String[] args) {
        int n = 15;
        int m = n + 1;

        String nBinary = toBinary(n);
        int nCountOne = countOne(nBinary);
        while (true) {
            String binary = toBinary(m);
            int mCountOne = countOne(binary);

            if (mCountOne == nCountOne) {
                break;
            }
            m++;
        }
        System.out.println(m);
    }

    public static String toBinary(int n) {
        StringBuilder binary = new StringBuilder();
        while (n > 1) {
            binary.append(n % 2);
            n /= 2;
        }
        return binary.toString();
    }

    public static int countOne(String binary) {
        int count = 0;
        for (int i = 0; i < binary.length(); i++) {
            if (binary.charAt(i) == '1') {
                count++;
            }
        }
        return count;
    }


}
