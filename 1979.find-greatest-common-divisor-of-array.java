/*
 * @lc app=leetcode id=1979 lang=java
 *
 * [1979] Find Greatest Common Divisor of Array
 */

// @lc code=start
class Solution {
    public int findGCD(int[] nums) {

        int min = nums[0];
        int max = nums[0];

        for (int i : nums) {

            min = Math.min(min, i);
            max = Math.max(max, i);

        }

        while (max != 0) {

            int temp = max;
            max = min % max;
            min = temp;
        }
        return min;
    }
}
// @lc code=end
