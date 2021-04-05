package com.busyqa.coursework.wk5_answer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
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
         * Sorts the list using a lambda expression.
         *
         * Note.-
         * The Collections.sort() method can be used as well.
         */
        //list.sort((name1, name2) -> (name1.compareToIgnoreCase(name2))); /* Modify this statement. */
        list.sort(String::compareToIgnoreCase);
        list.forEach(System.out::println);

    }

}
