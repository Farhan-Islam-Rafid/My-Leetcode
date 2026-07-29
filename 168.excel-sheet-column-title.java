/*
 * @lc app=leetcode id=168 lang=java
 *
 * [168] Excel Sheet Column Title
 */

// @lc code=start
class Solution {

    public String convertToTitle(int columnNumber) {

        StringBuilder ans = new StringBuilder();

        while (columnNumber > 0) {

            columnNumber--;

            ans.append((char) ('A' + columnNumber % 26));

            columnNumber /= 26;
        }

        return ans.reverse().toString();

    }
}
// @lc code=end

