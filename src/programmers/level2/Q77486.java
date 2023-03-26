package programmers.level2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Q77486 {
    private static class Person {
        private String name;
        private int amount = 0;
        private Person parent;

        public Person() {

        }

        public Person(String name) {
            this.name = name;
        }

        public String getName() {
            return this.name;
        }

        public Person getParent() {
            return this.parent;
        }

        public void setParent(Person parent) {
            this.parent = parent;
        }

        public int getAmount() {
            return this.amount;
        }

        public void addAmount(int num) {
            if (num < 10) {
                this.amount += num;
                return;
            }
            if (this.parent == null) {
                this.amount += (num - (int)(num*0.1));
                return;
            }
            this.amount += (num - (int)(num*0.1));
            this.parent.addAmount((int) (num * 0.1));
        }
    }

    public static void main(String[] args) {
        String[] enroll = {"john", "mary", "edward", "sam", "emily", "jaimie", "tod", "young"};
        String[] referral = {"-", "-", "mary", "edward", "mary", "mary", "jaimie", "edward"};
        String[] seller = {"young", "john", "tod", "emily", "mary"};
        int[] amount = {12, 4, 2, 5, 10};

        int[] answer = solution(enroll, referral, seller, amount);
        System.out.println("answer = " + Arrays.toString(answer));
    }

    private static int[] solution(String[] enroll, String[] referral, String[] seller, int[] amount) {
        Map<String, Person> tree = createTree(enroll, referral);

        for (int i = 0; i < seller.length; i++) {
            int price = amount[i] * 100;

            Person person = tree.get(seller[i]);
            person.addAmount(price);
        }

        int[] answer = new int[enroll.length];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = tree.get(enroll[i]).getAmount();
        }

        return answer;
    }

    private static Map<String, Person> createTree(String[] enroll, String[] referral) {
        Map<String, Person> tree = new HashMap<>();

        for (int i = 0; i < enroll.length; i++) {
            tree.put(enroll[i], new Person(enroll[i]));
        }

        for (int i = 0; i < referral.length; i++) {
            if (referral[i].equals("-")) {
                continue;
            }
            Person user = tree.get(enroll[i]);
            user.setParent(tree.get(referral[i]));
        }

        return tree;
    }
}
