package programmers.level2;

import java.util.Stack;

/**
 * 짝 지어 제거하기
 */
public class Q12973 {
    public static void main(String[] args) {
        String str = "baabaa";
        int result = solution(str);
        System.out.println("result = " + result);
    }

    private static int solution(String str) {
        Stack<Character> stack = new Stack<>();
        for (char c : str.toCharArray()) {
            if (stack.isEmpty() || stack.peek() != c) {
                stack.push(c);
                continue;
            }
            stack.pop();
        }
        return stack.isEmpty() ? 1 : 0;
    }

}
