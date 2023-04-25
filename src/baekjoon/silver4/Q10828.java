package baekjoon.silver4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Q10828 {
    static List<Integer> stack = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());

        for (int i = 0; i < count; i++) {
            String read = br.readLine();
            if (read.contains("push")) {
                StringTokenizer st = new StringTokenizer(read);
                st.nextToken(); // "push" 버리기
                int num = Integer.parseInt(st.nextToken());
                push(num);
                continue;
            }

            if (read.contains("pop")) {
                int pop = pop();
                System.out.println(pop);
                continue;
            }

            if (read.contains("size")) {
                int size = size();
                System.out.println(size);
                continue;
            }

            if (read.contains("empty")) {
                System.out.println(empty());
                continue;
            }

            if (read.contains("top")) {
                System.out.println(top());
            }
        }
    }

    private static int top() {
        if (stack.isEmpty()) {
            return -1;
        }
        return stack.get(stack.size() - 1);
    }

    private static int empty() {
        if (stack.isEmpty()) {
            return 1;
        }
        return 0;
    }

    private static int size() {
        return stack.size();
    }

    private static int pop() {
        if (stack.isEmpty()) {
            return -1;
        }
        return stack.remove(stack.size() - 1);
    }

    public static void push(int number) {
        stack.add(number);
    }
}
