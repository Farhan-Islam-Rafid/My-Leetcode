/*
 * @lc app=leetcode id=1732 lang=java
 *
 * [1732] Find the Highest Altitude
 */

// @lc code=start
class Solution {
    public int largestAltitude(int[] gain) {

        int max = 0;

        int temp = 0;

        for (int i : gain) {

            temp += i;

            max = Math.max(max, temp);
        }

        return max;
    }
}
// @lc code=end
