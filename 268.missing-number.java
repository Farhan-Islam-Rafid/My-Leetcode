/*
 * @lc app=leetcode id=268 lang=java
 *
 * [268] Missing Number
 */

// @lc code=start
class Solution {
    public int missingNumber(int[] nums) {

        int n = nums.length;

        int a = n * (n + 1) / 2;

        int b = 0;

        for (int i : nums) { // for(int i = 0 ; i < nums.length ; i++)

            b += i; // b = b+1

        }

        return a - b;

    }
}
// @lc code=end
