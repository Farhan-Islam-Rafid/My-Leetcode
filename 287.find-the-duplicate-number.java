
import java.util.Arrays;

/*
 * @lc app=leetcode id=287 lang=java
 *
 * [287] Find the Duplicate Number
 */
// @lc code=start
class Solution {

    public int findDuplicate(int[] nums) {

        Arrays.sort(nums);

        int end = nums.length - 1;

        for (int s = 0; s < end; s++) {

            if (nums[s] == nums[s + 1]) {

                return nums[s];

            }

        }

        return -1;
    }
}
// @lc code=end

