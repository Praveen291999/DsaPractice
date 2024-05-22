package dsaPractice.medium;

/*Example 1:

Ixput: x = 123
Output: 321
Example 2:

Ixput: x = -123
Output: -321
Example 3:

Ixput: x = 120
Output: 21
 */


//for integer overflow
//if (reverse > Integer.MAX_VALUE / 10 || (reverse == Integer.MAX_VALUE / 10 && r > Integer.MAX_VALUE % 10)) {return 0;}

/*Explanation: Max Integer size:2,147,483,647
 * 
 * So when reversing we are multiplying 10->for this we are using Integer.MAX_VALUE / 10
 * and if reverse==Integer.MAX_VALUE / 10 i.e.2,147,483,640 then we can add only 0-7 
 * that's y we are checking digit greater than 7.
 * */
public class ReverseInteger {
    public static void main(String[] args) {

        int x = 1534236469;
        int reverse = 0;

        boolean isNegative = x < 0;
        if (isNegative) {
            x = -x;
        }
        while (x > 0) {
            int digit = x % 10;
            
            // Check for overflow before updating reverse
            if (reverse > Integer.MAX_VALUE / 10 || (reverse == Integer.MAX_VALUE / 10 && digit > 7)) {
                // Overflow will occur
                System.out.println(0);
             
            }
             
            reverse = reverse * 10 + digit;
            x = x / 10;
        }
        if (isNegative) {
            reverse = -reverse;
        }
        System.out.println(reverse);

    }
}
