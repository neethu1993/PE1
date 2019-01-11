/* Program to find the sum of unspecified number of integers.
 * Until a non integer is provided by the input.
 */
package com.stackroute.p1;

public class IntegerSum {
    int sum=0;
    int total(int number){
        sum = sum + number;
        return sum;
    }
}
