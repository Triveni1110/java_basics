package com.java.basic;

import java.util.Scanner;

public class BinaryDecimalConversion {

	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the binary value");

		// if we take the binary number in decimal
		Double binNum = scan.nextDouble();
		String binNumString = String.valueOf(binNum);

		int indexOfDecimal = binNumString.indexOf(".");
		String a = binNumString.substring(0, indexOfDecimal);
		String b = binNumString.substring(indexOfDecimal + 1, binNumString.length());

		int dcm1 = convertBeforeDecimal(Integer.parseInt(a));
		Double dcm2 = convertAfterDecimal(Integer.parseInt(b));
		System.out.println("dcm1 :" + dcm1);
		System.out.println("dcm2 :" + dcm2);
		System.out.println("Decimal:" + (dcm1 + dcm2));
		/*
		 * int num=scan.nextInt(); int decRep=convertToDecimal(num);
		 * System.out.println(decRep);
		 */
	}

	private static int convertToDecimal(int num) {
		int i = 0;
		int rem = 1;
		int dcm1 = 0;
		while (num > 0) {
			rem = num % 10;
			num = num / 10;
			dcm1 = (int) (dcm1 + rem * Math.pow(2, i));
			i++;

		}
		return dcm1;
	}

	// test case failing for 11.001
	private static Double convertAfterDecimal(int b) {
		String numString = String.valueOf(b);
		int length = numString.length();
		int i = length;
		int rem = 0;
		Double dcm2 = 0d;
		for (int j = 0; j < numString.length(); j++) {
			rem = b % 10;
			b = b / 10;
			dcm2 = dcm2 + rem * Math.pow(2, -i);
			i--;

		}
		return dcm2;
	}

	private static int convertBeforeDecimal(int a) {
		int i = 0;
		int rem = 0;
		Double dcm1 = 0d;
		while (a > 0) {
			rem = a % 10;
			a = a / 10;
			dcm1 = dcm1 + rem * Math.pow(2, i);
			i++;

		}
		return dcm1.intValue();
	}

}
