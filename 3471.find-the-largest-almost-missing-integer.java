/*
 * @lc app=leetcode id=3471 lang=java
 *
 * [3471] Find the Largest Almost Missing Integer
 */

// @lc code=start
class Solution {

    public int largestInteger(int[] nums, int k) {

        int ans = -1;

        for (int i = 0; i < nums.length; i++) {

            int count = 0;

            for (int j = 0; j <= nums.length - k; j++) {

                for (int r = j; r < j + k; r++) {

                    if (nums[r] == nums[i]) {

                        count++;
                        break;
                    }
                }

            }

            if (count == 1) {

                ans = Math.max(ans, nums[i]);

            }

        }

        return ans;

    }
}
// @lc code=end

