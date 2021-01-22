package com.java.array;

import java.util.Scanner;

public class LeftRotate {

	public static void main(String[] args) {

		int a[] = { 0, 1, 2, 3, 4, 5, 6 };
		int b[] = { 0, 1, 2, 3, 4, 5, 6 };
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		System.out.println("left rotate");
		for (int i = 0; i < n; i++) {

			leftRotate(a);
		}
		for (int i : a) {
			System.out.println(i);
		}
		for (int i = 0; i < n; i++) {

			rightRotate(b);
		}
		System.out.println("right rotate");
		for (int i : b) {
			System.out.println(i);
		}

	}

	private static void leftRotate(int[] a) {
		int temp = a[0];
		int i = 0;
		for (; i < a.length - 1; i++) {
			a[i] = a[i + 1];
		}
		a[i] = temp;
	}

	private static void rightRotate(int[] a) {
		int temp = a[a.length - 1];
		int i = a.length - 1;
		for (; i > 0; i--) {
			a[i] = a[i - 1];
		}
		a[i] = temp;
	}
}
