/*
 * @lc app=leetcode id=977 lang=java
 *
 * [977] Squares of a Sorted Array
 */

// @lc code=start
class Solution {
    public int[] sortedSquares(int[] nums) {

        int[] ans = new int[nums.length];

        int left = 0;
        int right = nums.length - 1;

        for (int i = nums.length - 1; i >= 0; i--) {

            if (Math.abs(nums[left]) > Math.abs(nums[right])) {

                ans[i] = nums[left] * nums[left];

                left++;

            } else {

                ans[i] = nums[right] * nums[right];

                right--;
            }
        }

        return ans;

    }
}
// @lc code=end
