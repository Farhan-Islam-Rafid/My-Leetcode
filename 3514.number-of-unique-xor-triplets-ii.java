
/*
 * @lc app=leetcode id=3514 lang=java
 *
 * [3514] Number of Unique XOR Triplets II
 */
// @lc code=start
class Solution {

    public int uniqueXorTriplets(int[] nums) {

        final int M = 2048;

        boolean[][] dp = new boolean[4][M];

        dp[0][0] = true;

        for (int t = 0; t < 3; t++) {

            for (int x = 0; x < M; x++) {

                if (!dp[t][x]) {
                    continue;
                }

                for (int v : nums) {

                    dp[t + 1][x ^ v] = true;
                }
            }
        }

        int ans = 0;

        for (int x = 0; x < M; x++) {

            if (dp[3][x]) {
                ans++;
            }
        }

        return ans;
    }
}
// @lc code=end

