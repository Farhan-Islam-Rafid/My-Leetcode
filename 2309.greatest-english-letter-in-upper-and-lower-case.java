/*
 * @lc app=leetcode id=2309 lang=java
 *
 * [2309] Greatest English Letter in Upper and Lower Case
 */

// @lc code=start
class Solution {

    public String greatestLetter(String s) {

        for (char ch = 'Z'; ch >= 'A'; ch--) {

            if (s.indexOf(ch) != -1 && s.indexOf(ch + 32) != -1) {

                return String.valueOf(ch);
            }

        } 

        return "";
    }
}
// @lc code=end

