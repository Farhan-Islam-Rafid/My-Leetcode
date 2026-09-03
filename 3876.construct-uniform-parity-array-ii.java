/*
 * @lc app=leetcode id=3876 lang=java
 *
 * [3876] Construct Uniform Parity Array II
 */

// @lc code=start
class Solution {

    public boolean uniformArray(int[] nums1) {

        int min = nums1[0];

        for (int i : nums1) {

            min = Math.min(i, min);
        }

        if (min % 2 == 1) {
            return true;
        }

        for (int x : nums1) {

            if (x % 2 == 1) {
                return false;
            }
        }

        return true;
    }
}
// @lc code=end

