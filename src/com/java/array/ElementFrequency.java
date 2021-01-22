package com.java.array;

public class ElementFrequency {

	public static void main(String[] args) {

		// case 1: when the array is integer
		Integer arr[] = { 1, 2, 5, 6, 7, 1, 10, 12, 13, 21, 12, 12, 13 };

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != -1) {
				int count = 1;
				for (int j = i + 1; j < arr.length; j++) {
					if (arr[i] == arr[j]) {
						arr[j] = -1;
						count++;
					}
				}

				System.out.println(" The frequency of " + arr[i] + " is " + count);
			}
		}
		Integer arr1[] = { 1, 2, 5, 6, 7, 1, 10, 12, 13, 21, 12, 12, 13 };

		// to print duplicate elements only
		System.out.println("===============");
		System.out.println("The duplicate element in the array is ");
		for (int i = 0; i < arr1.length; i++) {
			if (arr1[i] != -1) {
				Integer count = 1;
				for (int j = i + 1; j < arr1.length; j++) {
					if (arr1[i] == arr1[j]) {
						arr1[j] = -1;
						count++;
					}
				}

				if (count > 1)
					System.out.print(arr1[i] + "  ");
			}
		}

		Integer arr2[] = { 1, 2, 5, 6, 7, 1, 10, 12, 13, 21, 12, 12, 13 };
		System.out.println();
		// to print unique elements only

		System.out.println("The unique element in the array is ");
		for (int i = 0; i < arr2.length; i++) {
			if (arr2[i] != -1) {
				Integer count = 1;
				for (int j = i + 1; j < arr2.length; j++) {
					if (arr2[i] == arr2[j]) {
						arr2[j] = -1;
						count++;
					}
				}

				if (count == 1)
					System.out.print(arr2[i] + "  ");
			}
		}
		System.out.println();

		// to find the min and max occuring element in array
		System.out.println("min/max in an array");
		Integer arr3[] = { 1, 2, 5, 6, 7, 1, 10, 12, 13, 21, 12, 12, 12, 12, 13, 1, 1 };
		int temp = 0;
		Integer temparr[] = new Integer[arr3.length];
		for (int i = 0; i < arr3.length; i++) {
			if (arr3[i] != -1) {
				Integer count = 1;
				temparr[temp] = arr3[i];

				for (int j = i + 1; j < arr3.length; j++) {
					if (arr3[i] == arr3[j]) {
						arr3[j] = -1;
						count++;
					}
				}
				// add logic to find the max repeating and min will degfinately be one who is
				// occuring only 1 time
				temp++;
			}
		}
		for (int i = 0; i < temparr.length; i++) {
			System.out.println(temparr[i]);
		}

		System.out.println();
		// case 2: when the array is char
		char a[] = { 'a', 'm', '1', 's', '1', 't', 'm', 'w' };
		for (int i = 0; i < a.length; i++) {
			if (a[i] != '*') {
				int count = 1;
				for (int j = i + 1; j < a.length; j++) {
					if (a[i] == a[j]) {
						a[j] = '*';
						count++;
					}
				}
				System.out.println(" Char " + a[i] + " occurs " + count + " times ");
			}
		}
	}

}
