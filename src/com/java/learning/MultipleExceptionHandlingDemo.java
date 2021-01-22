package com.java.learning;

public class MultipleExceptionHandlingDemo {

	public static void main(String[] args) {
		try {
			int a[] = { 2, 3, 4, 5, 56, 7 };

			a[10] = 23;// However it is not giving the compile time exception even the arary contain
						// only 6 elements

			int b = 0 / 0;
			System.out.println(b);
			System.out.println(a[10]);
		} catch (ArithmeticException | ArrayIndexOutOfBoundsException e)
		// multiple exception in one catch is used in java 1.7 and also we can hve
		// multiple catch with multiple exception (PREFERRABLE ...of course user won't
		// understand the technical exception ,so we can print message ie. user
		// friendly)

		/*
		 * All the exception can be catch by Exception ,we should specify after
		 * specifying the specific exception if we specify before then it will give COMPILE TIME ERROR
		 */

		{
			System.out.println(e);
		}
	}

}
