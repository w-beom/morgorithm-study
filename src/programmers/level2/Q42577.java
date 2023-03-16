package programmers.level2;

import java.util.Arrays;

/**
 * 전화번호부
 */
public class Q42577 {
    public static void main(String[] args) {
        String[] phoneBook = {"113333","115555","345555","555555", "345444"};
        boolean answer = solution(phoneBook);
        System.out.println("answer = " + answer);

    }

    private static boolean solution(String[] phone_book) {
        Arrays.sort(phone_book);

        for (int i = 0; i < phone_book.length - 1; i++) {
            if (phone_book[i + 1].startsWith(phone_book[i])) {
                return false;
            }
        }

        return true;
    }
}
