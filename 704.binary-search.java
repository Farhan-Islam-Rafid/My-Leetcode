/*
 * @lc app=leetcode id=704 lang=java
 *
 * [704] Binary Search
 */

// @lc code=start
class Solution {

    public int search(int[] nums, int target) {

        int left = 0, right = nums.length - 1;

        while (nums[left] <= nums[right]) {

            int center = left + (right - left) / 2;

            if (nums[center] == target) {

                return center;
            }

            if (nums[center] > target) {

                right = center - 1;
            } else {

                left = center + 1;
            }

        }

        return -1;
    }
}
// @lc code=end

