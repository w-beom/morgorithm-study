package programmers.level2;

public class Q12951 {
    public static void main(String[] args) {
        String s = "3people unFollowed me";
        String answer = "3people Unfollowed Me";
        System.out.println(solution(s));
        System.out.println(solution(s).equals(answer));
    }

    public static String solution(String s) {
        boolean isUpperCase = true;
        String answer = "";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isDigit(c)) {
                answer += c;
                isUpperCase = false;
                continue;
            }
            if (isUpperCase) {
                c = Character.toUpperCase(c);
                isUpperCase = false;
            } else {
                c = Character.toLowerCase(c);
            }
            if (Character.isSpaceChar(c)) {
                isUpperCase = true;
            }
            answer += c;
        }

        return answer;
    }
}
