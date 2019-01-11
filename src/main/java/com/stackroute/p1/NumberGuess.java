/* Program to guess a number between 1-50.
 * If the guessed number is less than the target number prints that case.
 * If the guessed number is greater than the target number prints that case.
 * The process continues until the user guesses the target number.
 */
package com.stackroute.p1;

public class NumberGuess {
    String guess (int number,int target) {

        //Scanner sc = new Scanner(System.in);

        /*Number guess performs within this while loop
         */

        while(true) {
            if (number<target) {
                return "Number guessed is less than original number. Guess another number between 1 and 50!!";
                //guess(sc.nextInt());
            }
            else if (number>target) {
                return "Number guessed is greater than original number. Guess another number between 1 and 50!!";
                //guess(sc.nextInt());
            }
            else {
                return "Number guessed matches the original number";
                //return number;
            }
        }
    }
}
