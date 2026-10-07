/*
 * @lc app=leetcode id=1221 lang=java
 *
 * [1221] Split a String in Balanced Strings
 */

// @lc code=start
class Solution {

    public int balancedStringSplit(String s) {

        int count = 0, ans = 0;

        for (char ch : s.toCharArray()) {

            if (ch == 'R') {

                count++;
            } else {

                count--;

            }

            if (count == 0) {

                ans++;
            }
        }

        return ans;

    }
}
// @lc code=end

