
import java.util.HashSet;

/*
 * @lc app=leetcode id=804 lang=java
 *
 * [804] Unique Morse Code Words
 */

// @lc code=start
class Solution {
    public int uniqueMorseRepresentations(String[] words) {

        String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};

        HashSet<String> set = new HashSet<>();

        for( String word : words ){

            String s = "";

            for(char x : word.toCharArray()){

                s += morse[x - 'a'];
            }

            set.add(s);
        }

        return set.size();
        
    }
}
// @lc code=end

