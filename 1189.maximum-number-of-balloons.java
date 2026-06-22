/*
 * @lc app=leetcode id=1189 lang=java
 *
 * [1189] Maximum Number of Balloons
 */

// @lc code=start
class Solution {
    public int maxNumberOfBalloons(String text) {

        int[] count = new int[26];

        for (char i : text.toCharArray()) {

            count[i - 'a']++;

        }

        int ans = count['b' - 'a'];

        ans = Math.min(ans, count['a' - 'a']);
        ans = Math.min(ans, count['l' - 'a'] / 2);
        ans = Math.min(ans, count['o' - 'a'] / 2);
        ans = Math.min(ans, count['n' - 'a']);

        return ans;

    }
}
// @lc code=end
