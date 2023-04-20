package leet._1.TwoSum;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public int[] twoSum(int[] nums, int target) {
        int[] answer = new int[2];
        int len = nums.length;

        for (int i = 0; i < len; i++) {
            int num = nums[i];
            int diff = target - num;

            for (int j = i + 1; j < len; j++) {
                if (nums[j] == diff) {
                    answer[0] = i;
                    answer[1] = j;
                    return answer;
                }
            }
        }

        return answer;
    }

    public int[] twoSumMap(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            map.put(nums[i], i);
        }
        return new int[] { -1, -1 };
    }

    public static void main(String[] args) {
        Main T = new Main();
        int[] nums = { 2, 7, 11, 15 };
        int target = 22;
        int[] answer = T.twoSumMap(nums, target);
        System.out.println(answer[0] + " " + answer[1]);
    }
}
