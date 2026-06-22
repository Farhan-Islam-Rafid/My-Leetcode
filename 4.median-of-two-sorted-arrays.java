
import java.util.Arrays;

/*
 * @lc app=leetcode id=4 lang=java
 *
 * [4] Median of Two Sorted Arrays
 */

// @lc code=start
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int[] merged_arry = new int[nums1.length + nums2.length];

        int i = 0, j = 0, k = 0;

        while (i < nums1.length) {

            merged_arry[k++] = nums1[i++];

        }
        while (j < nums2.length) {

            merged_arry[k++] = nums2[j++];

        }

        Arrays.sort(merged_arry);

        int size = merged_arry.length;

        if (size % 2 == 1) {

            return merged_arry[size / 2];

        } else {

            return (merged_arry[size / 2 - 1] + merged_arry[size / 2]) / 2.0;
        }

    }
}
// @lc code=end
