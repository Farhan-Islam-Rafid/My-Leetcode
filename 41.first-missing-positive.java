
import java.util.Arrays;

/*
 * @lc app=leetcode id=41 lang=java
 *
 * [41] First Missing Positive
 */

// @lc code=start
class Solution {
    public int firstMissingPositive(int[] nums) {

        Arrays.sort(nums);

        int ans = 1;

        for (int t : nums) {

            if (ans == t) {
                ans++;
            }
        }
        return ans;
    }
}
// @lc code=end
