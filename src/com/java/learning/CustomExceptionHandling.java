package com.java.learning;

/**
 * Sometime we want to call exception even if there is no exception we can just
 * call the exception
 * 
 * if we want to create our own exception using extending the exception class
 * and throw where we want to throw
 * 
 * @author hp
 *
 */
public class CustomExceptionHandling {

	public static void main(String[] args) {

		int i, j;
		i = 8;
		j = 9;

		try {
			int k = i / j;
			if (k == 0) {
				throw new MyOwnException("this is not possible");
			}
			System.out.println(k);

		} catch (MyOwnException e) {
			System.out.println("" + e.getMessage());
		}

	}

}
