/*
 * @lc app=leetcode id=942 lang=java
 *
 * [942] DI String Match
 */

// @lc code=start
class Solution {

    public int[] diStringMatch(String s) {

        int n = s.length();

        int ans[] = new int[n + 1];

        int low = 0, high = n;

        for (int i = 0; i < n; i++) {

            if (s.charAt(i) == 'I') {

                ans[i] = low++;

            } else {
                ans[i] = high--;
            }
        }

        ans[n] = low;

        return ans;

    }
}
// @lc code=end

