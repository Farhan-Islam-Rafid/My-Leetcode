
import java.util.Stack;

/*
 * @lc app=leetcode id=1190 lang=java
 *
 * [1190] Reverse Substrings Between Each Pair of Parentheses
 */
// @lc code=start
class Solution {

    public String reverseParentheses(String s) {

        Stack<String> stack = new Stack<>();
        StringBuilder current = new StringBuilder();

        for (char ch : s.toCharArray()) {

            if (ch == '(') {
                stack.push(current.toString());
                current.setLength(0);
            } else if (ch == ')') {
                current.reverse();

                current.insert(0, stack.pop());
            } else {
                current.append(ch);
            }
        }

        return current.toString();
    }
}
// @lc code=end

