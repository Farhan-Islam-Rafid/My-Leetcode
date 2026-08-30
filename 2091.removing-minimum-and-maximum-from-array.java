/*
 * @lc app=leetcode id=2091 lang=java
 *
 * [2091] Removing Minimum and Maximum From Array
 */

// @lc code=start
class Solution {
    public int minimumDeletions(int[] nums) {
        
        int n = nums.length , max = 0 , min = 0;
         
        for(int i = 1 ; i < n ; i ++){

            if (nums[i] < nums[min]) {
                min = i;
            }
             if (nums[i] > nums[max]) {
                max = i;
            }    
        }

         int a = Math.max(max, min);
         int b = Math.min(max, min);

            int front = a + 1;
            int back = n - b;
            int both = b+1 + n - a;

            int ans = Math.min(front, Math.min(back, both));

        return ans;

    }
}
// @lc code=end

