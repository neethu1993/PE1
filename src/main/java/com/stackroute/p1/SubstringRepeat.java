/* Program to repeat the last n characters of the string n times along with the given string.
 */
package com.stackroute.p1;

public class SubstringRepeat {
    String repeatsub(String string,int number) {
       int length;
       String substring;
       length = string.length();
        substring=string.substring(length-number); //Assigns the substring

        /*code to add the substring n number of times
         */

        for(int i=0;i<number;i++) {
            string=string+substring;
        }
        return string;
    }
}
