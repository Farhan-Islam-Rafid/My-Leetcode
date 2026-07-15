/*
 * @lc app=leetcode id=3658 lang=java
 *
 * [3658] GCD of Odd and Even Sums
 */

// @lc code=start
class Solution {
    public int gcdOfOddEvenSums(int n) {

        int oddsum = 0, evensum = 0;

        for (int i = 1; i < n + 1; i++) {

            oddsum += (2 * i - 1);
            evensum += (2 * i);
        }

        while (evensum != 0) {

            int temp = evensum;

            evensum = oddsum % evensum;

            oddsum = temp;

        }

        return oddsum;
    }
}
// @lc code=end
