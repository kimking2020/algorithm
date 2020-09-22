package priv.kimking.array;

import java.util.Arrays;

/**
 * <p>
 *
 * 1480. Running Sum of 1d Array
 *
 * Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).
 *
 * Return the running sum of nums.
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [1,2,3,4]
 * Output: [1,3,6,10]
 * Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].
 * Example 2:
 *
 * Input: nums = [1,1,1,1,1]
 * Output: [1,2,3,4,5]
 * Explanation: Running sum is obtained as follows: [1, 1+1, 1+1+1, 1+1+1+1, 1+1+1+1+1].
 * Example 3:
 *
 * Input: nums = [3,1,2,10,1]
 * Output: [3,4,6,16,17]
 *
 *
 * @author kim
 * @date 2020/9/22
 */
public class Q1480 {


    public static void main(String... args) {
        int[] nums = new int[]{1, 2, 3, 4};
        Q1480 q = new Q1480();
        int[] r = q.runningSum(nums);
        for (int i : r) {
            System.out.println(i);
        }
    }


    public int[] runningSum(int[] nums) {
        int cache = 0;
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            cache += nums[i];
            result[i] = cache;
        }
        return result;
    }
}
