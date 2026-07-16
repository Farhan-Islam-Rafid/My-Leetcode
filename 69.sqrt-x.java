/*
 * @lc app=leetcode id=69 lang=java
 *
 * [69] Sqrt(x)
 */

// @lc code=start
class Solution {
    public int mySqrt(int x) {

        int ans = 0;

        for (long i = 1; i * i <= x; i++) {

            ans = (int) i;
        }

        return ans;

    }
}
// @lc code=end
