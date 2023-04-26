package baekjoon.silver3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

public class Q2606 {
    static int count = 0;

    static class Node {
        int number;
        boolean visit;
        List<Node> nodes = new ArrayList<>();

        public Node(int number) {
            this.number = number;
        }

        public void addNode(Node node) {
            if (nodes.contains(node)) {
                return;
            }
            nodes.add(node);
        }

        public void visit() {
            if (visit) {
                return;
            }
            visit = true;
            count++;
            for (Node node : nodes) {
                node.visit();
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int computer = Integer.parseInt(bufferedReader.readLine());
        int computerSsang = Integer.parseInt(bufferedReader.readLine());
        Map<Integer, Node> map = new HashMap<>();

        for (int i = 0; i < computerSsang; i++) {
            String s = bufferedReader.readLine();
            StringTokenizer stringTokenizer = new StringTokenizer(s, " ");
            int firstNodeKey = Integer.parseInt(stringTokenizer.nextToken());
            int secondNodeKey = Integer.parseInt(stringTokenizer.nextToken());

            map.computeIfAbsent(firstNodeKey, key -> new Node(firstNodeKey));
            map.computeIfAbsent(secondNodeKey, key -> new Node(secondNodeKey));
            map.get(firstNodeKey).addNode(map.get(secondNodeKey));
            map.get(secondNodeKey).addNode(map.get(firstNodeKey));
        }
        map.get(1).visit();
        System.out.println(count - 1);
    }
}
