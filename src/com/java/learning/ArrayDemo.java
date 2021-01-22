package com.java.learning;

class Student {
	int id;
	String name;
}

public class ArrayDemo {

	public static void main(String[] args) {
		int num[] = new int[5];
		// int[] num2 = new int[6];
		// int num[] = {1,2,3,4,5,6,7};
		num[0] = 1;
		num[1] = 2;
		num[2] = 3;
		num[3] = 4;
		num[4] = 5;
		System.out.println("" + num[3]);

		num[3] = 76;
		System.out.println("" + num[3]);

		for (int i = 0; i < num.length; i++) {
			System.out.println("" + num[i]);
		}

		Student s[] = new Student[4];

		int a[] = { 1, 2, 3, 4 };
		int b[] = { 2, 3, 1, 4 };
		int c[] = { 3, 4, 5, 6 };

		int d[][] = { { 1, 2, 3, 4 }, { 2, 3, 1, 4 }, { 3, 4, 5, 6 } };

		System.out.println(d[0][1]);

		for (int row = 0; row <= 2; row++) {
			for (int col = 0; col <= 3; col++) {
				System.out.print("" + d[row][col] + " ");
			}
			System.out.println();
		}

		System.out.println("Jagged Matrix Demo");
		int j[][] = { { 1, 2, 3, 4 }, { 2, 3, 1 }, { 3, 4, 5, 6 } };

		System.out.println(j[1].length);
		for (int row = 0; row < j.length; row++) {
			for (int col = 0; col < (j[row].length); col++) {
				System.out.print(" " + j[row][col]);
			}
			System.out.println();
		}

		System.out.println("Enhanced For Loop for 1-d");

		for (int i : num) {
			System.out.println(i);
		}

		System.out.println("Enhanced For Loop for jagged 2-d");

		for (int row[] : j) {
			for (int col : row) {
				System.out.print(" " + col);
			}
			System.out.println();
		}

		System.out.println("We can use enhanced for loop for any array");
	}

}
