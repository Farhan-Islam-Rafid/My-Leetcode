/*
 * @lc app=leetcode id=3737 lang=java
 *
 * [3737] Count Subarrays With Majority Element I
 */

// @lc code=start
class Solution {
    public int countMajoritySubarrays(int[] nums, int target) {
        int ans = 0;

        for (int i = 0; i < nums.length; i++) {

            int count = 0;

            for (int j = i; j < nums.length; j++) {

                if (nums[j] == target) {

                    count++;
                }

                int sublen = j - i + 1;

                if (count > sublen / 2) {

                    ans++;
                }

            }
        }

        return ans;
    }
}
// @lc code=end
