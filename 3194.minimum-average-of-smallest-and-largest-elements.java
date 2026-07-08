
import java.util.Arrays;

/*
 * @lc app=leetcode id=3194 lang=java
 *
 * [3194] Minimum Average of Smallest and Largest Elements
 */

// @lc code=start
class Solution {
    public double minimumAverage(int[] nums) {

        Arrays.sort(nums);

        double ans = Double.MAX_VALUE;

        int left = 0, right = nums.length - 1;

        while (left < right) {

            double avg = (nums[left] + nums[right]) / 2.0;

            ans = Math.min(avg, ans);

            left++;
            right--;

        }

        return ans;

    }
}
// @lc code=end
