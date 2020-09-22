package priv.kimking.array;

/**
 * <p>
 *
 * 1470. Shuffle the Array
 *
 * Given the array nums consisting of 2n elements in the form [x1,x2,...,xn,y1,y2,...,yn].
 *
 * Return the array in the form [x1,y1,x2,y2,...,xn,yn].
 *
 * exp:
 * Input: nums = [2,5,1,3,4,7], n = 3
 * Output: [2,3,5,4,1,7]
 * Explanation: Since x1=2, x2=5, x3=1, y1=3, y2=4, y3=7 then the answer is [2,3,5,4,1,7].
 *
 * @author kim
 * @date 2020/9/22
 */
public class Q1470 {

    public static void main(String... args) {
        Q1470 q = new Q1470();
        int[] nums = new int[]{2, 5, 1, 3, 4, 7};
        int n = 3;
        int[] r = q.shuffle(nums, n);
        for (int i : r) {
            System.out.println(i);
        }

    }

    public int[] shuffle(int[] nums, int n) {
        int[] result = new int[2*n];
        for (int i = 0; i < 2*n; i++) {
            if (i % 2 == 0) {
                result[i] = nums[i/2];
            } else {
                result[i] = nums[n+(i-1)/2];
            }
        }
        return result;
    }

}
