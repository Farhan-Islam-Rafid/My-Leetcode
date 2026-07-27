
import java.util.Arrays;

/*
 * @lc app=leetcode id=1464 lang=java
 *
 * [1464] Maximum Product of Two Elements in an Array
 */
// @lc code=start
class Solution {

    public int maxProduct(int[] nums) {

        Arrays.sort(nums);

        int n = nums.length;

        int ans = (nums[n - 1] - 1) * (nums[n - 2] - 1);

        return ans;

    }
}
// @lc code=end

