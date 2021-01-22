package com.java.array;

public class MaxMinElement {

	public static void main(String[] args) {
		int a[] = { 10, 20, 30, 3, 4, 5, 6, 60, 20, 40 };

		int max = a[0], min = a[0];
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {

				if (a[j] > max) {
					max = a[j];
				} else if (a[j] < min) {
					min = a[j];
				}

			}

		}
		System.out.println("max:  " + max);
		System.out.println("min:  " + min);
	}

}
