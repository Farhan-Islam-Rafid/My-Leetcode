/*
 * @lc app=leetcode id=7 lang=java
 *
 * [7] Reverse Integer
 */

// @lc code=start
class Solution {
    public int reverse(int x) {

        int ans = 0;

        while (x != 0) {

            int lastdigi = x % 10;

            x /= 10; // last bade baki gula

            if (ans > Integer.MAX_VALUE / 10 ||
                    (ans == Integer.MAX_VALUE / 10 && lastdigi > 7))
                return 0;

            if (ans < Integer.MIN_VALUE / 10 ||
                    (ans == Integer.MIN_VALUE / 10 && lastdigi < -8))
                return 0;

            ans = ans * 10 + lastdigi;

        }

        return ans;
    }
}
// @lc code=end
