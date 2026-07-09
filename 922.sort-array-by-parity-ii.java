/*
 * @lc app=leetcode id=922 lang=java
 *
 * [922] Sort Array By Parity II
 */

// @lc code=start
class Solution {
    public int[] sortArrayByParityII(int[] nums) {

        int even = 0;
        int odd = 1;

        int arraysize = nums.length;
        while (even < arraysize && odd < arraysize) {

            if (nums[even] % 2 == 0) {

                even += 2;
            }

            else if (nums[odd] % 2 == 1) {

                odd += 2;
            }

            else {

                int temp = nums[even];

                nums[even] = nums[odd];

                nums[odd] = temp;
            }
        }

        return nums;

    }
}
// @lc code=end
