/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Questions.Chapter8;

/**
 *
 * @author araderma
 */
public class Question2 {

    /*  For this part of the assignment you will be doing simple array processing on an array of
    *   type double with the identifier input that is being passed as a parameter to this method.
     */
    public static Object[] Question2(double[] input) {

        /*  You should calculate and return the following values as elements of
         *   an array of type Object in the following order:
         *
         *  1) An int value representing the count (number of elements in the input array)
         *  2) A double value representing the sum (total of elements in the input array)
         *  3) A double value representing the value of the smallest element in the input array
         *      *Note: If there are no elements, return the special value Double.NaN
         *  4) A double value representing the value of the largest element in the input array
         *      *Note: If there are no elements, return the special value Double.NaN
         */
        Object[] array = new Object[4];
        int count = input.length;
        double sum = 0.0;
        double smallest = Double.NaN;
        double largest = Double.NaN;

        if (count > 0) {
            sum = input[0];
            smallest = input[0];
            largest = input[0];

            for (int i = 1; i < count; i++) {
                double value = input[i];
                sum += value;
                if (value < smallest) {
                    smallest = value;
                }
                if (value > largest) {
                    largest = value;
                }
            }
        }

        array[0] = count;
        array[1] = sum;
        array[2] = smallest;
        array[3] = largest;
        /* Create an Object[] that contains the count, sum, min, and max in that order and return that array
         */
        return array;
    }

}
