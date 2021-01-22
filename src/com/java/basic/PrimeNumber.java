package com.java.basic;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String args[]) {

		Scanner scan = new Scanner(System.in);

		/*
		 * int num = scan.nextInt(); int count = 0; for (int i = 1; i <= num; i++) { if
		 * (num % i == 0) count++; } if (count > 2) { System.out.println("not prime"); }
		 * else { System.out.println("prime"); } int cnt = 0; for (int i = 1; i <=
		 * Math.sqrt(num); i++) {
		 * 
		 * if (num % i == 0) { cnt++; } }
		 * 
		 * if (cnt > 1) { System.out.println("np"); } else { System.out.println("p"); }
		 */
		int begin = scan.nextInt();
		int end = scan.nextInt();

		for (int num = begin; num <= end; num++) {

			if (isPrime(num)) {
				System.out.println(num);
			}

		}
	}

	private static boolean isPrime(int num) {
		boolean flag = true;
		if (num == 1) {
			flag = true;
		}
		if (num >= 2) {
			for (int i = 2; i < Math.sqrt(num); i++) {

				if (num % i == 0) {
					flag = false;
				}

			}
		}
		return flag;
	}

}
