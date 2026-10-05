/*
 * @lc app=leetcode id=856 lang=java
 *
 * [856] Score of Parentheses
 */

// @lc code=start
class Solution {

    public int scoreOfParentheses(String s) {

        int count = 0, ans = 0;

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == '(') {
                count++;
            } else {

                count--;

                if (s.charAt(i - 1) == '(') {

                    ans += 1 << count;
                }
            }

        }

        return ans;

    }
}
// @lc code=end

