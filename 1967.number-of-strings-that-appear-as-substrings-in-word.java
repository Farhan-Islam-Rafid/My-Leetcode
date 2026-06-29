/*
 * @lc app=leetcode id=1967 lang=java
 *
 * [1967] Number of Strings That Appear as Substrings in Word
 */

// @lc code=start
class Solution {
    public int numOfStrings(String[] patterns, String word) {
        int count = 0;

        for (String s : patterns) {

            if (word.contains(s)) {
                count++;
            }
        }

        return count;
    }
}
// @lc code=end
