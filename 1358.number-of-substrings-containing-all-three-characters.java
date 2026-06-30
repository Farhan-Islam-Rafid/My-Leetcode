/*
 * @lc app=leetcode id=1358 lang=java
 *
 * [1358] Number of Substrings Containing All Three Characters
 */

// @lc code=start
class Solution {
    public int numberOfSubstrings(String s) {
        int[] count = new int[3];
        int left = 0, ans = 0;

        for (int right = 0; right < s.length(); right++) {

            count[s.charAt(right) - 'a']++;

            while (count[0] > 0 && count[1] > 0 && count[2] > 0) {

                ans += s.length() - right;

                count[s.charAt(left) - 'a']--;
                left++;
            }
        }

        return ans;

    }
}
// @lc code=end
