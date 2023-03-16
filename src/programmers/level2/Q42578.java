package programmers.level2;

import java.util.HashMap;
import java.util.Map;

public class Q42578 {
    public static void main(String[] args) {
        String[][] clothes = {{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}};
        int answer = solution(clothes);

        System.out.println("answer = " + answer);
    }

    private static int solution(String[][] clothes) {
        Map<String, Integer> clothesMap = new HashMap<>();

        for (String[] item : clothes) {
            String clothType = item[1];
            clothesMap.put(clothType, clothesMap.getOrDefault(clothType, 0) + 1);
        }

        int combinations = 1;
        for (int value : clothesMap.values()) {
            combinations *= (value + 1);
        }

        return combinations - 1;
    }
}
