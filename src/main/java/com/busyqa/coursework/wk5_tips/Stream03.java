package com.busyqa.coursework.wk5_tips;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Stream03 {

    /*
     * Goal:
     *
     * Using a Java Stream create comma-separated string based on a given list of integers.
     * Each element should be preceded by the letter 'e' if the number is even, and preceded
     * by the letter 'o' if the number is odd.
     *
     * For example, if the input list is (3,44), the output should be 'o3,e44'.
     *
     */
    public static void main(String[] args) {

        /*
         * Arrays.asList() method converts an Integer Array into an Integer List.
         */
        List<Integer> list=Arrays.asList(new Integer[]{13,35,46,25,62,89});

        String str = list.stream()
                           .map(i -> (i % 2) == 0 ? "e" + i : "o" + i)
                           .collect(Collectors.joining(",")); /* Join the elements of the stream using commas. */

        System.out.println(str);
    }

}
