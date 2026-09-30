/*
 * @lc app=leetcode id=476 lang=java
 *
 * [476] Number Complement
 */

// @lc code=start
class Solution {

    public int findComplement(int num) {

        int bits = Integer.toBinaryString(num).length();

        int mark = (1 << bits) - 1;

        return num ^ mark;

    }
}
// @lc code=end

