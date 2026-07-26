
import java.util.Arrays;

/*
 * @lc app=leetcode id=628 lang=java
 *
 * [628] Maximum Product of Three Numbers
 */
// @lc code=start
class Solution {

    public int maximumProduct(int[] nums) {

        Arrays.sort(nums);

        int len = nums.length;

        int case1 = nums[len - 1] * nums[len - 2] * nums[len - 3];
        int case2 = nums[0] * nums[1] * nums[len - 1];

        return Math.max(case1, case2);

    }
}
// @lc code=end

