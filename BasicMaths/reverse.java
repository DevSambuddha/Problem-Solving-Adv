/* 
 *  Reverse Integer (7)

Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.
Assume the environment does not allow you to store 64-bit integers (signed or unsigned).
 
Example 1:
Input: x = 123
Output: 321
Example 2:
Input: x = -123
Output: -321
Example 3:
Input: x = 120
Output: 21
 
Constraints:
•	-231 <= x <= 231 – 1

 */
package BasicMaths;

import java.util.*;
class reverse {
    public static int reverse(int x) {
        int revN = 0;
        while (x != 0) {
            int ld = x % 10;
            x /= 10;
            if (
                revN > Integer.MAX_VALUE / 10 ||
                (revN == Integer.MAX_VALUE / 10 && ld > 7)
            ) return 0;
            if (
                revN < Integer.MIN_VALUE / 10 ||
                (revN == Integer.MIN_VALUE / 10 && ld < -8)
            ) return 0;
            revN = revN * 10 + ld;
        }
        return revN;
    }
     // Driver program to run the case
     public static void main(String args[]) {
        int x =122324;
        System.out.println("Count of digits that divide N: " + reverse(x));
    }
}

