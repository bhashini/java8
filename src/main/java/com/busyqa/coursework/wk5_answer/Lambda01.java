package com.busyqa.coursework.wk5_answer;

import java.util.ArrayList;
import java.util.List;

public class Lambda01 {

    /*
     * Goal:
     * Modify the Java code below to print the elements of the list using
     * a lambda expression instead of the for-loop.
     *
     * Hint: Use the forEach() method of the List Interface.
     */
    public static void main(String[] args) {


        List<String> list=new ArrayList<String>();
        list.add("Rick");
        list.add("Negan");
        list.add("Daryl");
        list.add("Glenn");
        list.add("Carl");

//        for (String str: list) {
//            System.out.println(str);
//        }
        
        list.forEach(l -> System.out.println(l));

    }

}
