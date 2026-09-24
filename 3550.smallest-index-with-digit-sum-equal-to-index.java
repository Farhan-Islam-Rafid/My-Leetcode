/*
 * @lc app=leetcode id=3550 lang=java
 *
 * [3550] Smallest Index With Digit Sum Equal to Index
 */

// @lc code=start
class Solution {

    public int smallestIndex(int[] nums) {

        for (int i = 0; i < nums.length; i++) {

            int n = nums[i];

            int sum = 0;

            while (n > 0) {

                sum += n % 10;
                n /= 10;

            }

            if (sum == i) {
                return i;
            }

        }

        return -1;
    }
}
// @lc code=end

