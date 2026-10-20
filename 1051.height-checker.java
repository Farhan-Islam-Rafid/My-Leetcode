/*
 * @lc app=leetcode id=1051 lang=java
 *
 * [1051] Height Checker
 */

// @lc code=start
import java.util.Arrays;

class Solution {

    public int heightChecker(int[] heights) {

        int[] expected = heights.clone();

        Arrays.sort(heights);

        int ans = 0;

        for (int i = 0; i < heights.length; i++) {

            if (heights[i] != expected[i]) {
                ans++;
            }
        }

        return ans;

    }
}
// @lc code=end

