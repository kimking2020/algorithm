package priv.kimking.array;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * <p>
 *
 * 1431. Kids With the Greatest Number of Candies
 *
 * Given the array candies and the integer extraCandies, where candies[i] represents the number of candies that the ith kid has.
 *
 * For each kid check if there is a way to distribute extraCandies among the kids such that he or she can have the greatest number of candies among them. Notice that multiple kids can have the greatest number of candies.
 *
 *
 * exp:
 *
 * Input: candies = [2,3,5,1,3], extraCandies = 3
 * Output: [true,true,true,false,true]
 * Explanation:
 * Kid 1 has 2 candies and if he or she receives all extra candies (3) will have 5 candies --- the greatest number of candies among the kids.
 * Kid 2 has 3 candies and if he or she receives at least 2 extra candies will have the greatest number of candies among the kids.
 * Kid 3 has 5 candies and this is already the greatest number of candies among the kids.
 * Kid 4 has 1 candy and even if he or she receives all extra candies will only have 4 candies.
 * Kid 5 has 3 candies and if he or she receives at least 2 extra candies will have the greatest number of candies among the kids.
 *
 * @author kim
 * @date 2020/9/22
 */
public class Q1431 {

    public static void main(String... args) {
        Q1431 q = new Q1431();
        int[] cds = new int[]{2, 3, 5, 1, 3};
        int ext = 3;
        List<Boolean> r= q.kidsWithCandies(cds, ext);
        for (Boolean b: r) {
            System.out.println(b);
        }
    }

    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = Arrays.stream(candies).max().getAsInt();
        return Arrays.stream(candies).boxed().map(e ->  max - e <= extraCandies).collect(Collectors.toList());
    }
}
