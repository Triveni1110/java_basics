package com.java.array;

public class BubbleSort {

	public static void main(String[] args) {
		int a[] = { 10, 2, 6, 4, 9, 12, 34, 62, 8 };
		String as[] = { "this", "is", "my", "life", "dont", "dare", "to", "touch" };
		int temp = 0;
		String temp1 = null;

		for (int i = 0; i < a.length - 1; i++) {
			int swap_count = 0;
			for (int j = 0; j < a.length - 1 - i; j++) {
				if (a[j] > a[j + 1]) {
					temp = a[j + 1];
					a[j + 1] = a[j];
					a[j] = temp;
					swap_count++;
				}

			}
			if (swap_count == 0) {
				break;
			}
		}
		for (int i = 0; i < as.length; i++) {
			int swap_count = 0;
			for (int j = 0; j < as.length - 1 - i; j++) {
				//sorting on the bases of last chracter of string
				if (as[j].codePointAt(as[j].length()-1) > as[j+1].codePointAt(as[j+1].length()-1)) {
					temp1 = as[j + 1];
					as[j + 1] = as[j];
					as[j] = temp1;
					swap_count++;
				}
			}
			if (swap_count == 0) {
				break;
			}
		}

		for (int i = 0; i < a.length; i++) {
			System.out.print(" " + a[i]);
		}

		System.out.println("\n");
		for (int j = 0; j < as.length; j++) {
			System.out.print(" " + as[j]);
		}

	}

}
