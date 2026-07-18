/*e
 * @lc app=leetcode id=917 lang=java
 *
 * [917] Reverse Only Letters
 */

// @lc code=start
class Solution {
    public String reverseOnlyLetters(String s) {

        char[] ary = s.toCharArray();

        int left = 0;
        int right = ary.length - 1;

        while (left < right) {

            if (!Character.isLetter(ary[left])) {
                left++;
            } else if (!Character.isLetter(ary[right])) {
                right--;
            } else {

                char temp = ary[left];
                ary[left] = ary[right];
                ary[right] = temp;

                left++;
                right--;

            }

        }

        return new String(ary);

    }
}
// @lc code=end
