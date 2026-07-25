/*
 * @lc app=leetcode id=3536 lang=java
 *
 * [3536] Maximum Product of Two Digits
 */

// @lc code=start
class Solution {

    public int maxProduct(int n) {

        int first = 0;
        int second = 0;

        while (n > 0) {

            int digit = n % 10;

            if (digit > first) {

                second = first;
                first = digit;

            } else if (digit > second) {

                second = digit;
            }

            n /= 10;
        }

        return first * second;

    }
}
// @lc code=end

