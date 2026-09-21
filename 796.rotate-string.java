/*
 * @lc app=leetcode id=796 lang=java
 *
 * [796] Rotate String
 */

// @lc code=start
class Solution {

    public boolean rotateString(String s, String goal) {

        if (s.length() != goal.length()) {
            return false;
        } else {

            return (s + s).contains(goal);
        }

    }
}
// @lc code=end

