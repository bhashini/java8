package com.busyqa.coursework.wk5_answer;

import java.util.Arrays;
import java.util.List;

public class Stream04 {

    /*
     * Goal:
     *
     * Using a Java Stream find the average of a given list of integers.
     *
     */
    public static void main(String[] args) {

        /*
         * Arrays.asList() method converts an Integer Array into an Integer List.
         */
        List<Integer> list=Arrays.asList(new Integer[]{13,35,46,25,62,89});
        /* Add your code here */

        Double average = list.stream().mapToDouble(no -> no).average().getAsDouble();

        System.out.printf("The average is %.2f%n",average);
        /*
         * System.out.printf()
         *
         * %n   : new line.
         * %.2f : placeholder that represents a floating point number with 2 decimals.
         *
         * The %.2f placeholder is replaced by the average variable.
         */
    }

}
