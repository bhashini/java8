package com.busyqa.coursework.wk5_answer;

@FunctionalInterface
interface Operation {
	boolean check(int a);
}

public class Lambda02 {

	/*
	 * Given the functional interface called Operation defined above.
	 *
	 * Goal:
	 *
	 * Write the three lambda expressions below.
	 *
	 */
	public static void main(String[] args) {

		/*
		 * odd is a lambda expression that returns true if a number is odd, otherwise
		 * returns false.
		 */
		Operation odd = (int no) -> ((no % 2) != 0); /* Your solution here. */

		/*
		 * prime is a lambda expression that returns true if a number is prime,
		 * otherwise returns false.
		 */
		Operation prime = (int no) -> {
			for (int i = 2; i < no; i++) {
				if (no % i == 0) {
					return false;
				}
			}
			return true;
		};

		/*
		 * palindrome is a lambda expression that returns true if a number is
		 * palindrome, otherwise returns false.
		 *
		 * Note.- A palindrome number reads the same backward or forward. For instance:
		 * 1881
		 *
		 */
		
		//solution 01
		
		Operation palindrome = (int no) -> {
									String num = String.valueOf(no).toString();
									for(int i=0;i<(num.length())/2;i++) {
									if(num.toString().charAt(i) != num.toString().charAt((num.length()-1)-i))
									{
										return false;
									}
									
									}
						return true;			
		};
		
		
		//solution 02
		
//		Operation palindrome = (int no) -> {
//			String num = String.valueOf(no).toString();
//			String reverse = new StringBuilder(num).reverse().toString();
//			return num.equals(reverse);
//		};
		

		System.out.println(Lambda02.checker(odd, 2)); /* Check if 2 is odd */
		System.out.println(Lambda02.checker(odd, 7)); /* Check if 7 is odd */

		System.out.println(Lambda02.checker(prime, 7)); /* Check if 7 is prime */
		System.out.println(Lambda02.checker(prime, 8)); /* Check if 8 is prime */

		System.out.println(Lambda02.checker(palindrome, 1234)); /* Check if 1234 is palindrome */
		System.out.println(Lambda02.checker(palindrome, 1881)); /* Check if 1881 is palindrome */
	}

	public static boolean checker(Operation o, int num) {
		return o.check(num);
	}
}
