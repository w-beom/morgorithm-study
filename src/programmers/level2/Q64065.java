package programmers.level2;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Q64065 {
    public static void main(String[] args) {
        String s = "{{2},{2,1},{2,1,3},{2,1,3,4}}";
        int[] answer = solution(s);
        System.out.println("answer = " + Arrays.toString(answer));
    }

    private static int[] solution(String s) {
        String[] split = s.replaceAll("\\{", "").replaceAll("}", "").split(",");

        Map<Integer, Integer> map = new HashMap<>();

        for (String s3 : split) {
            int i = Integer.parseInt(s3);
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        return map.entrySet().stream()
                .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
                .mapToInt(Map.Entry::getKey)
                .toArray();
    }
}
