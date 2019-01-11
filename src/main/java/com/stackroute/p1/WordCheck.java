/* Program to check the word is vowel or consonent
 */
package com.stackroute.p1;

public class WordCheck {

    public String checkWord(String word) {
        int length = word.length();
        String type="";
        for(int i=0; i<length; i++) {

            /*Checks for alphabet
             */

            if ((word.charAt(i) >= 'a' && word.charAt(i) <= 'z') || (word.charAt(i) >= 'A' && word.charAt(i) <= 'Z')) {

                /*Checks for vowel or consonent
                 */

                switch (word.charAt(i)) {
                    case 'a':
                    case 'A':
                    case 'e':
                    case 'E':
                    case 'i':
                    case 'I':
                    case 'o':
                    case 'O':
                    case 'u':
                    case 'U':
                        type = "Vowel";
                        break;
                    default: type = "Consonent";
                    break;
                }
            }
            else{
                type = "Not Alphabet";
            }
        }
        return type;
    }
}
