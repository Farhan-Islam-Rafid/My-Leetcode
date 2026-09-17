/*
 * @lc app=leetcode id=717 lang=java
 *
 * [717] 1-bit and 2-bit Characters
 */

// @lc code=start
class Solution {

    public boolean isOneBitCharacter(int[] bits) {

        int i = 0, last = bits.length - 1;;

        while (i < last) {

            if (bits[i] == 1) {
                i += 2;
            } else {
                i++;
            }
        }

        if (i == last) {
            return true;    // return i == last;
        } else {
            return false;
        }

    }
}
// @lc code=end

