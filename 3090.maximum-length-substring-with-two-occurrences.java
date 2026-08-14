/*
 * @lc app=leetcode id=3090 lang=java
 *
 * [3090] Maximum Length Substring With Two Occurrences
 */

// @lc code=start
class Solution {

    public int maximumLengthSubstring(String s) {

        int ans = 0;

        for (int i = 0; i < s.length(); i++) {

            int[] cout = new int[26];

            for (int j = i; j < s.length(); j++) {

                int index = s.charAt(j) - 'a';

                cout[index]++;

                if (cout[index] > 2) {

                    break;
                }

                ans = Math.max(ans, j - i + 1);
            }

        }

        return ans;
    }
}
// @lc code=end

