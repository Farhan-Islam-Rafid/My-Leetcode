/*
 * @lc app=leetcode id=485 lang=java
 *
 * [485] Max Consecutive Ones
 */

// @lc code=start
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        

        int count = 0 , max = 0 ;

        for(int i : nums){

            if(i == 1){

                count++;

                max = Math.max(max, count);  //tulona kore  boro ta max a rakbe 
            }else{

                count = 0;
            }
        }

        return max;

    }
}
// @lc code=end

