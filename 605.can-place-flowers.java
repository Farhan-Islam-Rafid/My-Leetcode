/*
 * @lc app=leetcode id=605 lang=java
 *
 * [605] Can Place Flowers
 */

// @lc code=start
class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        

        for(int i = 0 ; i < flowerbed.length ; i ++){

             //bortoman a khali ki na?    //array ar 0 index and ar porer index   // array ar last index and last ar ager index
            if(flowerbed[i] == 0 &&    ( i == 0 || flowerbed[i - 1] == 0)        &&( i == flowerbed.length -1 || flowerbed[i +1 ] ==0 )){

                flowerbed[i] = 1;
                n--;
            }
        }

        return n <=0;
    }
}
// @lc code=end

