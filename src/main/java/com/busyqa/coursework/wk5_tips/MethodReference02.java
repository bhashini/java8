package com.busyqa.coursework.wk5_tips;

import java.util.ArrayList;
import java.util.List;

public class MethodReference02 {

    /*
     * Goal:
     *
     * Modify the Java code below to sort the list with a method reference
     * to the compareToIgnoreCase() method of the String Class instead of
     * the lambda expression.
     *
     */
    public static void main(String[] args) {


        List<String> list=new ArrayList<String>();
        list.add("Rick");
        list.add("Negan");
        list.add("Daryl");
        list.add("Glenn");
        list.add("Carl");

        /*
         * Sorts the list using a method reference to the compareToIgnoreCase()
         * method of the String class.
         */
        list.sort(String::compareToIgnoreCase);

        list.forEach(System.out::println);

    }

}
