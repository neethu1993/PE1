/*Program to check whether the given number is palindrome or not if it is a palindrome
 */
package com.stackroute.p1;

public class PalilndromeNumber {
    /*Method to check the number is palindrome and the sum of even digits is less than or greater than 25*/
    private long sum=0;
    private long copy;

    long palindrome(long number) {
        copy = number;
        long reverse = 0;
        long remainder;

        /*Performing the number reversal
         */

        while (number > 0) {
            remainder = number % 10;
            reverse = reverse * 10 + remainder;
            if (remainder % 2 == 0) {
                sum = sum + remainder;
            }
            number = number / 10;
        }
        return reverse;
    }

        /*Checks the reverse with original number
         */
        long total(long reverse){
        if(copy == reverse){
            if(sum < 25){
                //System.out.println( copy + " is palindrome and the sum of even numbers is less than 25");
            }
            else {
                //System.out.println( copy + " is palindrome and the sum of even numbers is greater than 25");
            }
        }
        else {
            //System.out.println( copy + " is not palindrome");
        }
        return sum;
    }
}
