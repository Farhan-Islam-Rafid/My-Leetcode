/*
 * @lc app=leetcode id=3718 lang=java
 *
 * [3718] Smallest Missing Multiple of K
 */

// @lc code=start
class Solution {

    public int missingMultiple(int[] nums, int k) {

        for (int mul = k;; mul += k) {

            boolean found = false;

            for (int i : nums) {

                if (i == mul) {

                    found = true;

                    break;

                }

            }

            if (found == false) {

                return mul;
            }
        }

    }
}
// @lc code=end

