/*
 * @lc app=leetcode id=3904 lang=java
 *
 * [3904] Smallest Stable Index II
 */

// @lc code=start
class Solution {
    public int firstStableIndex(int[] nums, int k) {
  int n = nums.length;
    int[] mx = new int[n], mn = new int[n];

    mx[0] = mn[n - 1] = nums[0];
    for (int i = 1; i < n; i++)
        mx[i] = Math.max(mx[i - 1], nums[i]);

    mn[n - 1] = nums[n - 1];
    for (int i = n - 2; i >= 0; i--)
        mn[i] = Math.min(mn[i + 1], nums[i]);

    for (int i = 0; i < n; i++)
        if (mx[i] - mn[i] <= k) return i;

    return -1;
    }
}
// @lc code=end

