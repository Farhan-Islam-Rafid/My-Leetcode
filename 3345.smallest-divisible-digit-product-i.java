/*
 * @lc app=leetcode id=3345 lang=java
 *
 * [3345] Smallest Divisible Digit Product I
 */

// @lc code=start
class Solution {

    public int smallestNumber(int n, int t) {

        while (true) {

            int num = n;
            int prod = 1;

            while (num != 0) {

                int dgt = num % 10;

                prod = dgt * prod;

                num = num / 10;

            }

            if (prod % t == 0) {

                return n;
            }
            n++;
        }

    }
}
// @lc code=end

