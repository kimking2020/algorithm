package priv.kimking.array;

/**
 * <p>
 *
 * 1365. How Many Numbers Are Smaller Than the Current Number
 *
 *
 * Given the array nums, for each nums[i] find out how many numbers in the array are smaller than it. That is, for each nums[i] you have to count the number of valid j's such that j != i and nums[j] < nums[i].
 *
 * Return the answer in an array.
 *
 *
 * exp:
 *
 * Input: nums = [8,1,2,2,3]
 * Output: [4,0,1,1,3]
 * Explanation:
 * For nums[0]=8 there exist four smaller numbers than it (1, 2, 2 and 3).
 * For nums[1]=1 does not exist any smaller number than it.
 * For nums[2]=2 there exist one smaller number than it (1).
 * For nums[3]=2 there exist one smaller number than it (1).
 * For nums[4]=3 there exist three smaller numbers than it (1, 2 and 2).
 *
 * @author kim
 * @date 2020/9/22
 */
public class Q1365 {

    public static void main(String... args) {
        Q1365 q = new Q1365();
        int[] nums = new int[]{8, 1, 2, 2, 3};
        for (int e : q.smallerNumbersThanCurrent(nums)) {
            System.out.println(e);
        }

    }

    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i] > nums[j]) {
                    result[i]++;
                } else if (nums[i] < nums[j]) {
                    result[j]++;
                }
            }
        }
        return result;
    }
}
