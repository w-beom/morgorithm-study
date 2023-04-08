package programmers.level2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

public class Q43164 {
    public String[] solution(String[][] tickets) {
        Map<String, Queue<String>> map = new HashMap<>();
        for (String[] ticket : tickets) {
            if (map.get(ticket[0]) == null) {
                Queue<String> queue = new PriorityQueue<>();
                queue.add(ticket[1]);
                map.put(ticket[0], queue);
            } else {
                map.get(ticket[0]).add(ticket[1]);
            }
        }

        List<String> list = new ArrayList<>();
        String start = "ICN";

        dfs(map, list, start);

        String[] answer = new String[list.size()];
        Collections.reverse(list);

        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }

    public void dfs(Map<String, Queue<String>> map, List<String> list, String start) {
        while (map.containsKey(start) && !map.get(start).isEmpty()) {
            dfs(map, list, map.get(start).poll());
        }
        list.add(start);
    }
}
