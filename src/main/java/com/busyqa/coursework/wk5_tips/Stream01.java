package com.busyqa.coursework.wk5_tips;

import java.util.ArrayList;
import java.util.List;

public class Stream01 {

    /*
     * Goal:
     * Using a Java Stream, print the places from Nepal in upper case letters and alphabetical order.
     */

    /*
     * Prepares a list of places.
     */
    static List<String> getPlaces(){

        List<String> places = new ArrayList<>();

        /*
         *  Add country and place to the list.
         */
        places.add("Nepal, Kathmandu");
        places.add("Nepal, Pokhara");
        places.add("India, Delhi");
        places.add("USA, New York");
        places.add("Africa, Nigeria");

        return places;
    }

    public static void main(String[] args) {

        List<String> places = Stream01.getPlaces();

        places.stream()
                .filter(p -> p.startsWith("Nepal")) /* Keeps only the elements that start with Nepal */
                .map(p -> p.toUpperCase()) /* Convert the elements to upper-case */
                .sorted() /* Sort in alphabetical order. */
                .forEach( p -> System.out.println(p)); /* Display the elements */
    }

}
