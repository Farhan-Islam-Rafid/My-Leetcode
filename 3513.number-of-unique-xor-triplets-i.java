
import java.util.HashSet;

/*
 * @lc app=leetcode id=3513 lang=java
 *
 * [3513] Number of Unique XOR Triplets I
 */
// @lc code=start
class Solution {

    public int uniqueXorTriplets(int[] nums) {

        // HashSet<Integer> set = new HashSet<>();
        // int len = nums.length;
        // for (int i = 0; i < len; i++) {
        //     for (int j = i; j < len; j++) {
        //         for (int k = j; k < len; k++) {
        //             set.add(nums[i] ^ nums[j] ^ nums[k]);
        //         }
        //     }
        // }
        // return set.size();
        int n = nums.length;

        if (n < 3) {
            return n;
        }

        int ans = 1;

        while (ans <= n) {

            ans *= 2;

        }

        return ans;
    }
}
// @lc code=end

