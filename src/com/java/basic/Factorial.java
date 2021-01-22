package com.java.basic;

import java.util.Scanner;

public class Factorial {
	
	public static int fact(int num) {
		int fact = 1;
		if (num == 0) {
			fact = 1;
		} else {
			fact = num * fact(num - 1);
		}
		return fact;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int num = scan.nextInt();
		int fact = 1;
		int fact1 = 1;
		int i = 1;
		while (i <= num) {
			fact = fact * i;
			i++;

		}
		
		int num2 = 7;
		for (int j = num2; j >=1; j--) {
			fact1 = fact1*j;
		}
		
		int num1 = 7;
		int fact3 = fact(num1);
		System.out.println(fact);
		System.out.println(fact1);
		System.out.println(fact3);
	}

}
