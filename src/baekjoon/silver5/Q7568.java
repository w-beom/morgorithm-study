package baekjoon.silver5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q7568 {
    static class Person {
        int rank = 1;
        int weight;
        int cm;

        public Person(int weight, int cm) {
            this.weight = weight;
            this.cm = cm;
        }

        public void addRank(Person person) {
            if (this.weight < person.weight && this.cm < person.cm) {
                this.rank++;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        List<Person> list = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            int weight = sc.nextInt();
            int cm = sc.nextInt();
            list.add(new Person(weight, cm));
        }

        for (Person person : list) {
            for (Person person1 : list) {
                person.addRank(person1);
            }
        }

        for (Person person : list) {
            System.out.print(person.rank + " ");
        }
    }
}
