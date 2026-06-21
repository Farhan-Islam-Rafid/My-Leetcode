/*
 * @lc app=leetcode id=75 lang=java
 *
 * [75] Sort Colors
 */

// @lc code=start
class Solution {

    public void sortColors(int[] nums) {

        int zero = 0, one = 0, two = 0;

        for (int n : nums) {

            if (n == 0) {
                zero++;
            } else if (n == 1) {
                one++;
            } else {
                two++;
            }
        }

        int i = 0;

        while (zero-- > 0) {
            nums[i++] = 0;

        }

        while (one-- > 0) {
            nums[i++] = 1;

        }

        while (two-- > 0) {
            nums[i++] = 2;

        }
    }
}

// @lc code=end

