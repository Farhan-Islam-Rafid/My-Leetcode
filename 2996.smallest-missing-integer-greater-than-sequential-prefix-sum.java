/*
 * @lc app=leetcode id=2996 lang=java
 *
 * [2996] Smallest Missing Integer Greater Than Sequential Prefix Sum
 */

// @lc code=start

class Solution {

    public int missingInteger(int[] nums) {

        int sum = nums[0];

        for (int i = 1; i < nums.length; i++) {

            if (nums[i] == nums[i - 1] + 1) {
                sum += nums[i];
            } else {
                break;
            }
        }

   
        while (true) {

            boolean found = false;

            for (int i = 0; i < nums.length; i++) {

                if (nums[i] == sum) {
                    found = true;
                    break;
                }
            }

        
            if (!found) {
                return sum;
            }

            
            sum++;
        }
    }
}

// @lc code=end

