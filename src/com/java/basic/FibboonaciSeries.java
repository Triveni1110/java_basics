package com.java.basic;

import java.util.Scanner;

public class FibboonaciSeries {
	static int t1 = 0;
	static int t2 = 1;
	static int temp = 0;

	static int n1 = 0, n2 = 1, n3 = 0;

	public static int fib(int num) {

		if (num == 0 || num == 1) {
			return num;
		} else {
			return fib(num - 1) + fib(num - 2);
		}
	}

	static void printFibonacci(int count) {
		if (count > 0) {
			n3 = n1 + n2;
			n1 = n2;
			n2 = n3;
			System.out.print(" " + n3);
			printFibonacci(count - 1);
		}
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int num = scan.nextInt();

		for (int i = 1; i <= num - 2; i++) {

			System.out.printf("%d ", t1);
			temp = t1 + t2;
			t1 = t2;
			t2 = temp;

		}
		System.out.println("enter the n value");
		int n = scan.nextInt();
		int fibnum = fib(n - 1);
		System.out.println(fibnum);

		int count = 10;
		System.out.print(n1 + " " + n2);// printing 0 and 1
		printFibonacci(count - 2);// n-2 because 2 numbers are already printed
	}

}
