import java.util.*;
/*
 * @lc app=leetcode id=1331 lang=java
 *
 * [1331] Rank Transform of an Array
 */

// @lc code=start
class Solution {
    public int[] arrayRankTransform(int[] arr) {

        int[] temp = arr.clone(); // clone banalam main array ar

        Arrays.sort(temp); // sort korlam subuthar joono

        HashMap<Integer, Integer> map = new HashMap<>(); // hashmap use kore data ar rank store korbo

        int rank = 1; // rank 1 set kore debo 1st ar ta , pore ++ use kore barabo

        for (int x : temp) { // temp ke akbar kore travers korbe

            if (!map.containsKey(x)) { // chack korbo j dublecat number jate bar bar rank set na hoee

                map.put(x, rank++); // protita number ar serialy rank set korbo
            }
        }

        for (int i = 0; i < arr.length; i++) { // main array ar loop chalabo

            arr[i] = map.get(arr[i]); // proti ta number ar rank set kotbo arr[i] ar moddeh ahon
                                      // { 10 , 40 , 20} -> {1 , 3, 2} set hobe
        }

        return arr; // final array method a return korbo

    }
}
// @lc code=end
