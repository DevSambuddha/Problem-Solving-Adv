/*Count the digits
for  String N = "122324";
*/

package BasicMaths;


import java.util.Arrays;

public class countDigits {

    // Utility function to check if N is divisible by the given digit
    public static boolean divisible(String N, int digit) {
        // Convert N to an integer for checking divisibility
        int number = Integer.parseInt(N);
        return (number % digit == 0);
    }

    // Function to count digits that appear in N and divide N
    static int allDigits(String N) {
        // We initialize all digits of N as not divisible by N.
        Boolean[] divide = new Boolean[10];
        Arrays.fill(divide, Boolean.FALSE);
        divide[1] = true; // 1 divides all numbers

        // Check divisibility of N by digits 2 to 9
        for (int digit = 2; digit <= 9; digit++) {
            if (divisible(N, digit)) {
                divide[digit] = true;
            }
        }

        // Traverse the number string to count digits that divide N
        int result = 0;
        for (int i = 0; i < N.length(); i++) {
            int currentDigit = N.charAt(i) - '0';
            
            // Skip 0 as dividing by zero is undefined
            if (currentDigit != 0 && divide[currentDigit]) {
                result++;
            }
        }

        return result;
    }

    // Driver program to run the case
    public static void main(String args[]) {
        String N = "122324";
        System.out.println("Count of digits that divide N: " + allDigits(N));
    }
}
