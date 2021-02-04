package com.java.basic;

import java.util.Scanner;

/**
 * Consider the following series: 1, 1, 2, 3, 4, 9, 8, 27, 16, 81, 32, 243, 64,
 * 729, 128, 2187 …
 * 
 * This series is a mixture of 2 series – all the odd terms in this series form
 * a geometric series and all the even terms form yet another geometric series.
 * Write a program to find the Nth term in the series.
 * 
 * The value N in a positive integer that should be read from STDIN. The Nth
 * term that is calculated by the program should be written to STDOUT. Other
 * than value of n th term,no other character / string or message should be
 * written to STDOUT. For example , if N=16, the 16th term in the series is
 * 2187, so only value 2187 should be printed to STDOUT.
 * 
 * You can assume that N will not exceed 30.
 * 
 * @author hp
 *
 */
public class NumberSeries02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int r1 = 2;
		int r2 = 3;
		int a1 = 1;
		int a2 = 1;

		System.out.println("Enter the term upto you want to print the series?");
		int lastTerm = scan.nextInt();

		System.out.print(a1 + " " + a2);

		for (int i = 3; i <= lastTerm; i++) {
			if (i % 2 != 0) {
				a2 = a2 * r1;
				System.out.print(" " + a2);
			} else if (i % 2 == 0) {
				a1 = a1 * r2;
				System.out.print(" " + a1);
			}
		}
		System.out.println();
		System.out.println("Enter the term you want to find out???");
		int findTerm = scan.nextInt();
		int resultFindTerm = 0;

		if (findTerm == 1 || findTerm == 2) {
			resultFindTerm = 1;
		} else if (findTerm > 2) {
			int power = (int) (findTerm / 2) ;
			if (findTerm % 2 == 0) {
				resultFindTerm = (int) Math.pow(3, power);
			} else if (findTerm % 2 != 0) {
				resultFindTerm = (int) Math.pow(2, power);

			}

		}
		System.out.println(resultFindTerm);
	}

}
