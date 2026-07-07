/*
 * @lc app=leetcode id=3754 lang=java
 *
 * [3754] Concatenate Non-Zero Digits and Multiply by Sum I
 */

// @lc code=start
class Solution {
    public long sumAndMultiply(int n) {

        long x = 0;
        int sum = 0;

        String s = String.valueOf(n);

        for (int i = 0; i < s.length(); i++) {

            char c = s.charAt(i);

            if (c != '0') {

                x = x * 10 + (c - '0');
                sum += (c - '0');

            }
        }

        return x * sum;

    }
}
// @lc code=end
