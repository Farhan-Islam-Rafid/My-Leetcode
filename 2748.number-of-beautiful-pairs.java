/*
 * @lc app=leetcode id=2748 lang=java
 *
 * [2748] Number of Beautiful Pairs
 */

// @lc code=start
class Solution {
    public int countBeautifulPairs(int[] nums) {
        int ans = 0;

        for (int i = 0; i < nums.length; i++) {
            int first = nums[i];
            while (first > 9) first /= 10;

            for (int j = i + 1; j < nums.length; j++)
                if (gcd(first, nums[j] % 10) == 1)
                    ans++;
        }

        return ans;
    }

    int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
}
// @lc code=end

