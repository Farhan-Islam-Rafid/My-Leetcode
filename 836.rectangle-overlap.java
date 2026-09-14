/*
 * @lc app=leetcode id=836 lang=java
 *
 * [836] Rectangle Overlap
 */

// @lc code=start
class Solution {

    public boolean isRectangleOverlap(int[] rec1, int[] rec2) {

        int wh = Math.min(rec1[2], rec2[2]) - Math.max(rec1[0], rec2[0]);

        int hi = Math.min(rec1[3], rec2[3]) - Math.max(rec1[1], rec2[1]);

        return wh > 0 && hi > 0;
    }
}
// @lc code=end

