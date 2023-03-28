package programmers.level1;

import java.util.HashSet;
import java.util.Set;

public class Q1845 {
    public static void main(String[] args) {
        int[] nums = {3, 1, 2, 3};
        int answer = solution(nums);
    }

    private static int solution(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }

        int choiceCount = nums.length / 2;
        return Math.min(choiceCount, set.size());
    }
}
