
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/*
 * @lc app=leetcode id=3731 lang=java
 *
 * [3731] Find Missing Elements
 */
// @lc code=start
class Solution {

    public List<Integer> findMissingElements(int[] nums) {

        int min = nums[0];  // min max = 0 nelam pore add korar jonno 
        int max = nums[0];

        HashSet<Integer> set = new HashSet<>(); // hasset use kortasi uink int rakhar jonno 

        for (int x : nums) {

            min = Math.min(min, x);   // nums ar min ber kortasi 
            max = Math.max(max, x);   // nums ar max ber kortasi

            set.add(x); // unik int gulo set a add kortasi 
        }

        List<Integer> ans = new ArrayList<>();  //akhon new linkedlist a new valu j gula nae se gula rakbo

        for (int i = min + 1; i < max; i++) {

            if (!set.contains(i)) {

                ans.add(i);

            }
        }

        return ans;
    }
}
// @lc code=end

