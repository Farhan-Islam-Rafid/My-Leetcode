/*
 * @lc app=leetcode id=3498 lang=java
 *
 * [3498] Reverse Degree of a String
 */

// @lc code=start
class Solution {

    public int reverseDegree(String s) {

        int sum = 0;

        for (int i = 0; i < s.length(); i++) {

            int val = 26 - (s.charAt(i) - 'a');

            sum += val * (i + 1);
        }

        return sum;

    }
}
// @lc code=end

