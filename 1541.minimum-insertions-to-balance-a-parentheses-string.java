/*
 * @lc app=leetcode id=1541 lang=java
 *
 * [1541] Minimum Insertions to Balance a Parentheses String
 */

// @lc code=start
class Solution {

    public int minInsertions(String s) {
        int ans = 0, count = 0;

        for (char c : s.toCharArray()) {
            if (c == '(') {
                if (count % 2 == 1) {
                    ans++;
                    count--;
                }
                count += 2;
            } else {
                count--;
                if (count < 0) {
                    ans++;
                    count = 1;
                }
            }
        }

        return ans + count;
    }
}
// @lc code=end

