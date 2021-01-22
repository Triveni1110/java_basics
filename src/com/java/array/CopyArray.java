package com.java.array;

import java.util.Scanner;

public class CopyArray {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		int size = scan.nextInt();
		Integer arr[] = new Integer[size];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scan.nextInt();
		}
		Integer temparr[] = new Integer[arr.length];
		for (int i = 0; i < temparr.length; i++) {
			temparr[i] = arr[i];
		}

		for (Integer integer : temparr) {
			System.out.println(integer);
		}
	}

}
