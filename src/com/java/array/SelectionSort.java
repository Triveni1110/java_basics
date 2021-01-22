package com.java.array;

public class SelectionSort {

	public static void main(String[] args) {
		int a[] = { 12, 5, 3, 2, 98, 76, 23, 76, 43, 18, 6, 34 };

		int temp = 0;
		for (int i = 0; i < a.length; i++) {
			int min = i;
			for (int j = i + 1; j < a.length; j++) {
				// for i=0; considering the ith posiion holding min..comparing it with all to
				// get smallest out of the rest
				if (a[j] < a[min]) {
					min = j;

				}
			}

			// for i=0; after getting the minimun elemnt position swap it with the i th
			// position to get the smallest no at first position or ith pos
			temp = a[i];
			a[i] = a[min];
			a[min] = temp;
		}

		for (int i = 0; i < a.length; i++) {
			System.out.println("" + a[i]);
		}
	}

}
