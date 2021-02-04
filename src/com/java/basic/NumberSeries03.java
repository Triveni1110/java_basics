package com.java.basic;

import java.util.Scanner;

/**
 * Consider the below series :
 * 
 * 0, 0, 2, 1, 4, 2, 6, 3, 8, 4, 10, 5, 12, 6, 14, 7, 16, 8
 * 
 * This series is a mixture of 2 series all the odd terms in this series form
 * even numbers in ascending order and every even terms is derived from the
 * previous term using the formula (x/2)
 * 
 * Write a program to find the nth term in this series.
 * 
 * The value n in a positive integer that should be read from STDIN the nth term
 * that is calculated by the program should be written to STDOUT. Other than the
 * value of the nth term no other characters /strings or message should be
 * written to STDOUT.
 * 
 * For example if n=10,the 10 th term in the series is to be derived from the
 * 9th term in the series. The 9th term is 8 so the 10th term is (8/2)=4. Only
 * the value 4 should be printed to STDOUT.
 * 
 * You can assume that the n will not exceed 20,000.
 * 
 * @author hp
 *
 */
public class NumberSeries03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a1 = 0, a2 = 0;
		System.out.println("Enter the number of terms you want to print");
		int lastTerm = scan.nextInt();

		int a[] = new int[lastTerm];
		a[0] = 0;
		a[1] = 0;
		if (lastTerm == 1) {
			System.out.print(a[0]);
		} else if (lastTerm == 2) {
			System.out.print(a[0]);
			System.out.print(a[1]);
		} else if (lastTerm > 2) {
			for (int i = 2; i < lastTerm; i++) {
				if (i % 2 == 0) {
					a[i]=i;
				} else if (i % 2 != 0) {
					a[i]=a[i-1]/2;
				}
			}
			
			System.out.println("the series terms are:");
			for (int i = 0; i < a.length; i++) {
				System.out.println(a[i]);
			}
		}

		
		System.out.println("Entr the term you want to search");
		int searchTerm=scan.nextInt();
		
		System.out.println(a[searchTerm-1]);
		
	}

}
