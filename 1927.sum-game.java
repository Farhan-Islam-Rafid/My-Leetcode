
class Solution {

    public boolean sumGame(String s) {

        // Difference of known digits
        int d = 0,
                // Difference of '?' count
                q = 0,
                // String length
                n = s.length();

        // Check every character
        for (int i = 0; i < n; i++) {

            // If character is '?'
            if (s.charAt(i) == '?') {

                // Left = -1, Right = +1
                q += i < n / 2 ? -1 : 1;

            } else {

                // Left add, Right subtract
                d += i < n / 2
                        ? s.charAt(i) - '0'
                        : -(s.charAt(i) - '0');
            }
        }

        // Equal '?' count: d must not be 0
        // Unequal '?' count: compare with q*9/2
        return q == 0 ? d != 0 : d != q * 9 / 2;
    }
}
