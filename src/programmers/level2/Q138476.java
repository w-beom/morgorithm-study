package programmers.level2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * 귤 고르기
 */
public class Q138476 {
    public static void main(String[] args) {
        int k = 5;
        int[] tangerine = {1, 1, 2, 3, 3, 4, 4, 4, 4, 4, 5, 5, 5};
        int answer = solution(k, tangerine);
        System.out.println("answer = " + answer);
    }

    public static int solution(int k, int[] tangerine) {
        Arrays.sort(tangerine);
        Map<Integer, Integer> map = new HashMap<>();

        for (int j : tangerine) {
            Integer integer = map.get(j);
            if (integer == null) {
                map.put(j, 1);
                continue;
            }
            map.put(j, integer + 1);
        }

        List<Integer> list = new ArrayList<>();
        for (Integer integer : map.keySet()) {
            list.add(map.get(integer));
        }

        list.sort(Comparator.reverseOrder());

        int count = 0;
        for (Integer integer : list) {
            if (k <= 0) {
                break;
            }
            k -= integer;
            count++;
        }

        return count;
    }

}
