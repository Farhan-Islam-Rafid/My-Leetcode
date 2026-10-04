/*
 * @lc app=leetcode id=678 lang=java
 *
 * [678] Valid Parenthesis String
 */

// @lc code=start
class Solution {

    public boolean checkValidString(String s) {

        int min = 0, max = 0;

        for (char c : s.toCharArray()) {

            if (c == '(') {

                max++;
                min++;
            } else if (c == ')') {

                max--;
                min--;
            } else {

                min--;
                max++;
            }

            if (max < 0) {

                return false;
            }

            min = Math.max(0, min);
        }

        return min == 0;

    }
}
// @lc code=end

