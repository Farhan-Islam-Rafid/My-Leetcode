/*
 * @lc app=leetcode id=925 lang=java
 *
 * [925] Long Pressed Name
 */

// @lc code=start
class Solution {
    public boolean isLongPressedName(String name, String typed) {

        int count_name = 0; // pointer for name string
        int count_typed = 0; // pointer for typed string

        while (count_typed < typed.length()) {

            if (count_name < name.length() && name.charAt(count_name) == typed.charAt(count_typed)) {

                count_name++;
                count_typed++;

            } else if (count_typed > 0 && typed.charAt(count_typed) == typed.charAt(count_typed - 1)) {

                count_typed++;

            } else {

                return false;
            }
        }

        return count_name == name.length();
    }
}
// @lc code=end
