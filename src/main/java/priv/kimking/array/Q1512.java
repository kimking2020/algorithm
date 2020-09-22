package priv.kimking.array;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * 1512. Number of Good Pairs
 *
 * Given an array of integers nums.
 *
 * A pair (i,j) is called good if nums[i] == nums[j] and i < j.
 *
 * Return the number of good pairs.
 *
 * exp:
 *
 * Input: nums = [1,2,3,1,1,3]
 * Output: 4
 * Explanation: There are 4 good pairs (0,3), (0,4), (3,4), (2,5) 0-indexed.
 *
 * @author kim
 * @date 2020/9/22
 */
public class Q1512 {

    public static void main(String... args) {
        Q1512 q = new Q1512();
        int[] nums = new int[]{1, 2, 3, 1, 1, 3};
        System.out.println(q.numIdenticalPairs(nums));
    }

    public int numIdenticalPairs(int[] nums) {
        int result = 0;
        Map<Integer, Integer> counts = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int count = counts.getOrDefault(nums[i], 0);
            counts.put(nums[i], ++count);
        }
        for (int n : counts.values()) {
            result += n * (n -1)/2;
        }
        return result;
    }
}
