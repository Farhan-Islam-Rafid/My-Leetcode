/*
 * @lc app=leetcode id=3702 lang=java
 *
 * [3702] Longest Subsequence With Non-Zero Bitwise XOR
 */

// @lc code=start
class Solution {

    public int longestSubsequence(int[] nums) {

        int ans = 0;

        for (int i : nums) {

            ans ^= i;

        }

        if (ans != 0) {

            return nums.length;
        }

        for (int i : nums) {

            if (i != 0) {

                return nums.length - 1;
            }

        }

        return 0;
    }
}
// @lc code=end

