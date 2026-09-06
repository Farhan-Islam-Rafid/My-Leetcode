/*
 * @lc app=leetcode id=115 lang=java
 *
 * [115] Distinct Subsequences
 */

// @lc code=start
class Solution {

    public int numDistinct(String s, String t) {

        int tl = t.length();

        int[] dp = new int[tl + 1];

        dp[0] = 1;

        for (char c : s.toCharArray()) {

            for (int j = tl; j > 0; j--) {
                if (c == t.charAt(j - 1)) {
                    dp[j] += dp[j - 1];
                }
            }
        }

        return dp[tl];
    }
}
// @lc code=end

