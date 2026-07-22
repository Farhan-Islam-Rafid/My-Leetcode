/*
 * @lc app=leetcode id=414 lang=java
 *
 * [414] Third Maximum Number
 */

// @lc code=start
import java.util.Collections;
import java.util.HashSet;

class Solution {

    public int thirdMax(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for (int num : nums) {
            set.add(num);
        }

        int firstMax = Collections.max(set);

        if (set.size() < 3) {
            return firstMax;
        }

        set.remove(firstMax);
        int secondMax = Collections.max(set);

        set.remove(secondMax);

        return Collections.max(set);
    }
}
// @lc code=end

