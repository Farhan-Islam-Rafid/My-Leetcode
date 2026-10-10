/*
 * @lc app=leetcode id=1047 lang=java
 *
 * [1047] Remove All Adjacent Duplicates In String
 */

// @lc code=start
class Solution {

    public String removeDuplicates(String s) {

        int n = 0;

        char[] ary = new char[s.length()];

        for (char ch : s.toCharArray()) {

            if (n > 0 && ary[n - 1] == ch) {

                n--;

            } else {

                ary[n++] = ch;
            }
        }

        String ans = new String(ary, 0, n);

        return ans;

    }
}
// @lc code=end

