package programmers.level2;

/**
 * 이진 변환 반복하기
 */
public class Q70129 {
    public static void main(String[] args) {
        int[] solution = solution("110010101001");
        System.out.println(solution[0] + " " + solution[1]);
    }

    public static int[] solution(String s) {
        int zeroCount = 0;
        int convertCount = 0;
        while (true) {
            if ("1".equals(s)) {
                break;
            }
            int length = s.length();
            String convert = s.replaceAll("0", "");
            int convertLength = convert.length();
            zeroCount += (length - convertLength);
            StringBuilder ss = new StringBuilder();
            while (convertLength > 0) {
                ss.insert(0, String.valueOf(convertLength % 2));
                convertLength /= 2;
            }
            s = ss.toString();
            convertCount++;
        }
        int[] answer = {convertCount, zeroCount};
        return answer;
    }
}
