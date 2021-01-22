/**
 * 
 */
package com.java.basic;

import java.util.Scanner;

/**
 * @author hp
 *
 */
public class Calculator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		Double num1 = scan.nextDouble();
		Double num2 = scan.nextDouble();

		System.out.println("Enter the operation you want to execute:::");
		char operation = scan.next().charAt(0);

		Double result = 0d;
		switch (operation) {

		case '+':
			result = num1 + num2;
			break;
		case '-':
			result = num1 - num2;
			break;
		case '*':
			result = num1 * num2;
			break;
		case '/':
			result = num1 / num2;
			break;
		default:
			System.out.println("No valid Input");
		}
		System.out.println(result);
	}

}
