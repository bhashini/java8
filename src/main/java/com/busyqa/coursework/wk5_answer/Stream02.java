package com.busyqa.coursework.wk5_answer;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Stream02 {

    /*
     * Goal:
     *
     * Given a list of names, using a Java Stream create another list with the names
     * that start with letter 'D' (upper case) and have exactly 3 letters.
     *
     */
    public static void main(String[] args) {


        List<String> list=new ArrayList<String>();
        list.add("Rick");
        list.add("Don");
        list.add("Negan");
        list.add("Daryl");
        list.add("Glenn");
        list.add("Dan");
        list.add("Carl");
        list.add("dam");
        
        /* Add your code here. */

        List<String> anotherList = list.stream()
        							.filter(name -> name.startsWith("D") && name.length() == 3)
        							.collect(Collectors.toList());

        System.out.println(anotherList);

    }

}
