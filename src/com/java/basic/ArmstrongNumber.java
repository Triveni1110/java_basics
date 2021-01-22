package com.java.basic;

import java.util.Scanner;

/**
 * a number is an armstrong number if and only if the sum of cube of all digit
 * of a number is equal to the number. for eg: 153 is an armstrong or not:
 * checkArmstrong(n) { int r=n%10; num=num/10; sum=sum+Math.pow(r,3);
 * 
 * }
 *
 * 
 * if(sum == n) then armstrng else not an armstrng
 * 
 * @author hp
 *
 */
public class ArmstrongNumber {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		Integer num = scan.nextInt();
		checkArmstrong(num);

	}

	private static void checkArmstrong(Integer num) {

		Integer temp = num;
		Integer rem = 0, sum = 0;

		while (num > 0) {
			rem = num % 10;
			num = num / 10;
			sum = (int) (sum + Math.pow(rem, 3));

		}

		if (temp.equals(sum)) {
			System.out.println("Number is armstrong");
		} else {
			System.out.println("Not an armstrong");
		}
	}

}
