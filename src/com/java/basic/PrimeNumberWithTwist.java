package com.java.basic;

import java.util.Scanner;

/**
 * Write a code to check whether no is prime or not. Condition use function
 * check() to find whether entered no is positive or negative , if negative then
 * enter the no, And if yes pas no as a parameter to prime() and check whether
 * no is prime or not?
 * 
 * Whether the number is positive or not, if it is negative then print the
 * message “please enter the positive number” It is positive then call the
 * function prime and check whether the take positive number is prime or not.
 * 
 * @author hp
 *
 */
public class PrimeNumberWithTwist {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		Boolean isPositive = check(num);

		if (isPositive) {
			Boolean isPrime = isPrime(num);
			if (isPrime) {
				System.out.println("The Number is prime number");
			} else {
				System.out.println("The Number is not a prime number");
			}
		} else {
			System.out.println("Please Enter the positive Number");
		}
	}

	private static Boolean isPrime(int num) {
		Boolean isPrime = true;
		if (num == 0 || num == 1) {
			isPrime = false;
		} else {
			for (int i = 2; i < Math.sqrt(num); i++) {
				if (num % i == 0) {
					isPrime = false;
				}
			}
		}
		return isPrime;
	}

	private static Boolean check(int num) {
		Boolean isPositive = true;
		isPositive = num > 0 ? true : false;
		return isPositive;
	}

}
