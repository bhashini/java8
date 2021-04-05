package com.busyqa.coursework.wk5_answer;

import java.util.ArrayList;
import java.util.List;

import java.util.stream.Collectors;




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

    	/*
    	 * Add your solution here.
    	 */
    	
        List<String> places = Stream01.getPlaces();
       List<String> napalPlaces = places.stream().filter((nepal) -> nepal.startsWith("Nepal"))
        			   .map((nepalPlaces) -> nepalPlaces.toUpperCase())
        			   .sorted()
        			   .collect(Collectors.toList());
        
       napalPlaces.forEach(System.out::println);
		
	}
        

    }


