
/*
 * @lc app=leetcode id=55 lang=java
 *
 * [55] Jump Game
 */

// @lc code=start
class Solution {
    public boolean canJump(int[] nums) {

        int fc = 0;

        for (int i = 0; i < nums.length; i++) {

            if (i > fc) {
                return false;
            }

            fc = Math.max(fc, i + nums[i]);
        }

        return true;
    }
}
// @lc code=end
