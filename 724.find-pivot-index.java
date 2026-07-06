/*
 * @lc app=leetcode id=724 lang=java
 *
 * [724] Find Pivot Index
 */

// @lc code=start
class Solution {
    public int pivotIndex(int[] nums) {

        int arry_sum = 0;

        for (int sum : nums) {

            arry_sum += sum;
        }

        int left = 0;

        for (int i = 0; i < nums.length; i++) {

            if (left == arry_sum - left - nums[i]) {

                return i;
            }

            left += nums[i];

        }

        return -1;

    }
}
// @lc code=end
