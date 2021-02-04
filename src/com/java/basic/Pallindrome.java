/**
 * 
 */
package com.java.basic;

import java.util.Scanner;

/**
 * @author hp
 *
 */
public class Pallindrome {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();

		int temp = num;
		int rev = 0;
		int r = 1;
		// to find the reverse of a number
		while (num > 0) {
			r = num % 10;
			num = num / 10;
			rev = rev * 10 + r;

		}
		if (temp == rev) {
			System.out.println("Pallindrome");
		} else {
			System.out.println("Not a pallindrome");
		}

		for (; num > 0; num = num / 10) {
			r = num % 10;
			rev = rev * 10 + r;

		}

		System.out.println(rev);

		String testString = scan.next();
		int length = testString.length();
		int i = 0;
		Boolean flag = true;

		while (i <= (length / 2) + 1) {
			if (testString.charAt(i) != (testString.charAt((length - 1) - i))) {
				flag = false;

			}
			i++;
		}

		if (flag) {
			System.out.println("String is pallindrome");
		} else {
			System.out.println("Not a pallindrome");
		}

		System.out.println("USING CHAR[] ARRAY");
		char[] testStringByte = testString.toCharArray();
		length = testStringByte.length;
		char[] revString = new char[length];
		int j = 0;
		while (j < length) {
			revString[j] = testStringByte[(length - 1) - j];
			j++;
		}
		int k = 0;
		while (k < length) {
			System.out.print(revString[k]);
			k++;
		}
		System.out.println();
		System.out.println("USING STRING BUFFER");
		StringBuffer sb1 = new StringBuffer(testString);
		StringBuffer sb2 = new StringBuffer(testString);
		sb1.reverse();
		System.out.println(sb1.equals(sb2));

		System.out.println("USING STRING BUILDER");
		StringBuilder sbl1 = new StringBuilder(testString);
		sbl1.reverse();
		System.out.println(sbl1);
	}

}
