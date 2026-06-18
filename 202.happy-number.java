
import java.util.HashSet;

/*
 * @lc app=leetcode id=202 lang=java
 *
 * [202] Happy Number
 */

// @lc code=start
class Solution {
    public boolean isHappy(int n) {

        HashSet<Integer> store = new HashSet<>();

        while (true) {

            int sum = 0;

            while (n != 0) {

                int digt = n % 10;
                sum += digt * digt;
                n = n / 10;

            }

            if (sum == 1)
                return true;

            if (store.contains(sum))
                return false;

            store.add(sum);

            n = sum;

        }

    }
}
// @lc code=end
