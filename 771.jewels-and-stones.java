/*
 * @lc app=leetcode id=771 lang=java
 *
 * [771] Jewels and Stones
 */

// @lc code=start
class Solution {

    public int numJewelsInStones(String jewels, String stones) {

        int ans = 0;

        for (char ch : stones.toCharArray()) {

            if (jewels.indexOf(ch) != -1) {
                ans++;
            }

        }

        return ans;
    }
}
// @lc code=end

