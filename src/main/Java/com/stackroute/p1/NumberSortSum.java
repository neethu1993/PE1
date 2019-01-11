/* Program to sort the digits in nonincreasing order.
 * Also find the sum of even digits.
 * If the sum is greater than 15, then print True.
 * Otherwise, print False.
 */
package com.stackroute.p1;

public class NumberSortSum {
    int sort (long number) {
        int i=0;
        int sum = 0;
        int temp;
        int array[] = new int[30];

        /*Assigning each digits to the array
         */

        while(number > 0) {
            array[i]= (int) number % 10;
            number = number / 10;
            i++;
        }
        /*Sorting
         */

        for(int j=0;j<i;j++) {
            for(int k=0;k<j+1;k++){
                if (array[j]>=array[k]){
                    temp=array[k];
                    array[k] = array[j];
                    array[j] = temp;
                }
            }
        }

        /*Prints the sorted digits and calculates the sum of even digits
         */

        //System.out.print("Sorted number in non-increasing order : ");
        for(int j=0;j<i;j++) {
            if(array[j] % 2 == 0) {
                sum = sum + array[j];
            }
            //System.out.print(array[j]);
        }
        //System.out.println("\n");
        //System.out.println("Sum of even numbers : "+ sum);
        //System.out.println();

        /*Checks the sum greater or less than 15
         */

        if (sum>15) {
            //System.out.println("True");
        }
        else {
            //System.out.println("False");
        }
        return sum;
    }
}
