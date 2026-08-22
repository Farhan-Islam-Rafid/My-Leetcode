/*
 * @lc app=leetcode id=3622 lang=java
 *
 * [3622] Check Divisibility by Digit Sum and Product
 */

// @lc code=start
class Solution {

    public boolean checkDivisibility(int n) {

        int dgsum = 0, dgprod = 1, org = n;

        while (n > 0) {

            int dg = n % 10;

            dgsum += dg;
            dgprod *= dg;

            n /= 10;
        }
        int div = dgsum + dgprod;

        int ans = org % div;

        if (ans == 0) {
            return true;
        } else {
            return false;
        }

    }
}
// @lc code=end

