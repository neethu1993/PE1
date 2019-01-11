/* Program to find the type of the input character.
 */
package com.stackroute.p1;

public class CharacterType {
    String typeChar(char character) {

        /*Code to check the type of character
         */
        if ( character >= 'a' && character <= 'z' ) {
            return "Small case letter";
        }
        else if ( character >= 'A' && character <= 'Z' ) {
            return "Capital letter";
        }
        else if (character >= '0' && character <= '9' ) {
            return "A digit";
        }
        else {
            return "Special symbol";
        }
    }
}
