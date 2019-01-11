/* Program to reverse the given input string.
 */
package com.stackroute.p1;

public class StringReverse {
    String reversal(String string){
        String reverse = "";
        int length;
        length = string.length();
        /*String reversal code
         */

        for(int i=length-1;i>=0;i--) {
            reverse = reverse + string.charAt(i);
        }
        return reverse;
    }
}
