package com.java.basic;

import java.util.Scanner;

/**
 * Find the 15th term of the series?
 * 
 * 0,0,7,6,14,12,21,18, 28
 * 
 * Explanation : In this series the odd term is increment of 7 {0, 7, 14, 21,
 * 28, 35 – – – – – – }
 * 
 * And even term is a increment of 6 {0, 6, 12, 18, 24, 30 – – – – – – }
 * 
 * so what we are going to do is to print this series first and then we will find
 * the nth term of the series.
 * 
 * @author hp
 *
 */
public class NumberSeries01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t1 = 0, t2 = 0;
		int a = 6;
		int b = 7;

		System.out.println("Enter the number upto the series should print::");
		int lastTerm = scan.nextInt();
		if (lastTerm == 1) {
			System.out.println(t1);
		} else if (lastTerm == 2) {
			System.out.print(t1);
			System.out.print(t2);
		} else if (lastTerm > 2) {

			System.out.print(" " + t1);
			System.out.print(" " + t2);
			int temp1 = 1, temp2 = 1;
			for (int i = 3; i <= lastTerm; i++) {

				if (i % 2 == 0) {
					System.out.print(" " + a * temp1);
					temp1++;
				} else if (i % 2 != 0) {
					System.out.print(" " + b * temp2);
					temp2++;
				}
			}
		}
		System.out.println();
		System.out.println("Enter the nth term you want to find???");
		int findTerm = scan.nextInt();
		int resultFindTerm = 0;

		if (findTerm == 1 || findTerm == 2) {
			resultFindTerm = 0;
		} else if (findTerm > 2) {
			if (findTerm % 2 == 0) {
				// then the resultant term should be multiple of 6
				resultFindTerm = 6 * ((findTerm / 2) - 1);
			} else if (findTerm % 2 != 0) {
				// then the resultant term should be multiple of 7
				resultFindTerm = 7 * (int) (findTerm / 2);
			}
		}
		System.out.println("The " + findTerm + "of the series is equal to :::" + resultFindTerm);
	}

}
