
import java.util.Arrays;

/*
 * @lc app=leetcode id=1833 lang=java
 *
 * [1833] Maximum Ice Cream Bars
 */

// @lc code=start
class Solution {
    public int maxIceCream(int[] costs, int coins) {

        Arrays.sort(costs);

        int buycount = 0;

        for (int i : costs) {

            if (coins < i) {
                break;
            }
            coins -= i;
            buycount++;
        }

        return buycount;
    }
}
// @lc code=end
