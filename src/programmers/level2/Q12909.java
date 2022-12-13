package programmers.level2;

import java.util.EmptyStackException;
import java.util.Stack;

/**
 * 올바른 괄호
 */
public class Q12909 {
    public static void main(String[] args) {
        String s = ")(()";
        System.out.println(solution(s));
    }

    public static boolean solution(String s) {
        Stack<Character> stack = new Stack<>();
        try {
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if (c == '(') {
                    stack.push(c);
                } else {
                    stack.pop();
                }
            }
        } catch (EmptyStackException e) {
            return false;
        }
        return stack.empty();
    }
}
