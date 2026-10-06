/*
 * @lc app=leetcode id=921 lang=java
 *
 * [921] Minimum Add to Make Parentheses Valid
 */

// @lc code=start
class Solution {

    public int minAddToMakeValid(String s) {
        int count = 0, ans = 0;

        for (char ch : s.toCharArray()) {

            if (ch == '(') {

                count++;
            } else {

                if (count > 0) {

                    count--;
                } else {

                    ans++;
                }
            }
        }

        return ans + count;
    }
}
// @lc code=end

