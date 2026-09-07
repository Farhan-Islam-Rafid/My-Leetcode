/*
 * @lc app=leetcode id=940 lang=java
 *
 * [940] Distinct Subsequences II
 */

// @lc code=start
import java.util.HashMap;

class Solution {

    public int distinctSubseqII(String s) {
        long MOD = 1000000007L;

        HashMap<Character, Long> end = new HashMap<>();
        long total = 0;

        for (char c : s.toCharArray()) {
            long add = (total + 1) % MOD;

            total = (total + add - end.getOrDefault(c, 0L) + MOD) % MOD;

            end.put(c, add);
        }

        return (int) total;
    }
}
// @lc code=end

