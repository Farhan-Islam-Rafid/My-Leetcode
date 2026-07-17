/*
 * @lc app=leetcode id=70 lang=java
 *
 * [70] Climbing Stairs
 */

// @lc code=start
class Solution {
    public int climbStairs(int n) {

        if (n == 2) {
            return 2;
        }

        if (n == 1) {
            return 1;
        }

        int a = 1, b = 2;

        for (int i = 3; i <= n; i++) {

            int c = a + b;

            a = b;
            b = c;
        }

        return b;

    }
}
// @lc code=end
