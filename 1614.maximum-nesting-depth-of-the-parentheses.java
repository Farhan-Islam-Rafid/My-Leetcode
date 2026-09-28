/*
 * @lc app=leetcode id=1614 lang=java
 *
 * [1614] Maximum Nesting Depth of the Parentheses
 */

// @lc code=start
class Solution {

    public int maxDepth(String s) {

        int cunt = 0, deep = 0;

        for (char ch : s.toCharArray()) {

            if (ch == '(') {

                cunt++;

                deep = Math.max(cunt, deep);

            } else if (ch == ')') {
                cunt--;
            }

        }

        return deep;
    }
}
// @lc code=end

