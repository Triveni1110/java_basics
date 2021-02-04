package com.java.basic;

import java.util.Scanner;

public class DecimalBinaryConversion {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		Integer num = scan.nextInt();
		System.out.println(Integer.toBinaryString(num));

	}

}
