/*
 * @lc app=leetcode id=3723 lang=java
 *
 * [3723] Maximize Sum of Squares of Digits
 */

// @lc code=start
class Solution {

    public String maxSumOfSquares(int num, int sum) {
        if (sum > num * 9) {
            return "";
        }

        StringBuilder ans = new StringBuilder();

        while (num > 0) {
            int digit = Math.min(9, sum);
            ans.append(digit);
            sum -= digit;
            num--;
        }

        return sum == 0 ? ans.toString() : "";
    }
}

// @lc code=end

