/*Program to print a number pattern.
 * If the input is 5.
 * Output should be 1 2 2 3 3 3 4 4 4 4 5 5 5 5 5.
 */
package com.stackroute.p1;

import java.lang.*;

public class NumberPattern {
    String pattern (int number) {

        /*Pattern is printed here
         */
        StringBuilder string = new StringBuilder();
        for(int i=1;i<=number;i++) {
            for (int j = 0; j < i; j++) {
                string.append(String.valueOf(i));
                string.append(" ");
            }
        }
        return string.toString();
    }
}
