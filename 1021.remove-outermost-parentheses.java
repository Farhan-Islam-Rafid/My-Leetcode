/*
 * @lc app=leetcode id=1021 lang=java
 *
 * [1021] Remove Outermost Parentheses
 */

// @lc code=start
class Solution {

    public String removeOuterParentheses(String s) {

        String ans = "";
        int count = 0;

        for (char ch : s.toCharArray()) {

            if (ch == '(') {

                count++;
                if (count > 1) {

                    ans += ch;
                }
            } else {

                count--;

                if (count > 0) {
                    ans += ch;
                }
            }

        }

        return ans;

    }
}
// @lc code=end

