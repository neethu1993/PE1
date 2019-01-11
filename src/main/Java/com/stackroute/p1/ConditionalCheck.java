/*Program to check whether the given number is odd or even.
 *If its even check whether its between 20 and 30 and print as Jerry.
 *If its odd check whether its between 20 and 30 and print as Tom
 */
package com.stackroute.p1;

public class ConditionalCheck {
    String check(int number) {
      /*
        Code to check odd or even
         */
      String name = "unknown";

        if(number % 2 != 0) {

            /*
            code to check the number is between 20 and 30
             */

            if (number > 20 && number < 30) {
                 name = "Tom";
            }
        }
        else{

             /*
            code to check the number is between 20 and 30
             */

            if (number > 20 && number < 30) {
                name = "Jerry";
            }
        }
        return name;
    }
}
