package com.busyqa.coursework.wk5_answer;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class MethodReference01 {

	/*
	 * Goal:
	 *
	 * Modify the Java code below to print the elements of the list using a method
	 * reference to the println() method of System.out instead of the for-loop.
	 *
	 * Hint: Use the forEach() method of the List Interface.
	 */
	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();
		list.add("Rick");
		list.add("Negan");
		list.add("Daryl");
		list.add("Glenn");
		list.add("Carl");

//        for (String str: list) {
//            System.out.println(str);
//        }

		list.forEach(System.out::println);

	}

}
