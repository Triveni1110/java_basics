package com.java.basic;

import java.util.Scanner;

/**
 * A year is said to be leap year if it is divisible by 4 but at the same time
 * if it is a century year that it shoudl be divisible by 400.
 * 
 * @author hp
 *
 */
public class LeapYearOrNot {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// Enter the no of leap year in an array
		int size = scan.nextInt();

		int a[][] = new int[size][2];
		for (int i = 0; i < a.length; i++) {
			int j = 0;
			a[i][j] = scan.nextInt();

		}
		System.out.println("Entered year array is::::");
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(" " + a[i][j]+" ");
			}
			System.out.println();
		}

		System.out.println("Checking the array element if leap or not");
		for (int i = 0; i < a.length; i++) {
			int j = 1;
			a[i][j] = checkLeap(a[i][0]);
		}
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(" " + a[i][j]+" ");
			}
			System.out.println();
		}
	}

	private static int checkLeap(int year) {
		int isLeap = 1;

		if (year % 100 == 0) {
			if (year % 400 != 0) {
				isLeap = 0;
			}
		} else {
			if (year % 4 != 0) {
				isLeap = 0;
			}
		}
		return isLeap;
	}

}
