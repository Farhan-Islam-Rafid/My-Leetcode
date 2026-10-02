/*
 * @lc app=leetcode id=3483 lang=java
 *
 * [3483] Unique 3-Digit Even Numbers
 */

// @lc code=start
class Solution {

    public int totalNumbers(int[] digits) {
        int stor[] = new int[10];

        int ans = 0;

        for (int count : digits) {
            stor[count]++;
        }

        for (int i = 1; i < 10; i++) {
            for (int j = 0; j < 10; j++) {

                for (int k = 0; k < 9; k += 2) {

                    stor[i]--;
                    stor[j]--;
                    stor[k]--;

                    if (stor[i] >= 0 && stor[j] >= 0 && stor[k] >= 0) {

                        ans++;
                    }

                    stor[i]++;
                    stor[j]++;
                    stor[k]++;

                }
            }

        }

        return ans;

    }

}
// @lc code=end

