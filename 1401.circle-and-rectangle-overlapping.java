/*
 * @lc app=leetcode id=1401 lang=java
 *
 * [1401] Circle and Rectangle Overlapping
 */

// @lc code=start
class Solution {

    public boolean checkOverlap(int radius, int xCenter, int yCenter, int x1, int y1, int x2, int y2) {

        int x = Math.max(x1, Math.min(xCenter, x2)) - xCenter;

        int y = Math.max(y1, Math.min(yCenter, y2)) - yCenter;

        return x * x + y * y <= radius * radius;

    }
}
// @lc code=end

