package com.java.learning;

class Calc {
	public int add(int... n)// {1,2,3,3,4,4,}{You are passing the values but going as an array,multiple
							// parameter leads to pass as array
	// which are called as Variable length arguments.

	{
		int sum = 0;

		for (int num : n) {
			sum = sum + num;
		}
		return sum;
	}

}

public class VaragsDemo {

	public static void main(String[] args) {
		Calc normalArgs = new Calc();

		// what if user want to have additon of more than two elements or may be 10 or
		// may be 100 elemnts
		// Java provide a feature "..." three dots,it doesn't matter how many parameter
		// you will pass but all element will be
		// passed as array,and thus to add we hve to itrate for loop
		System.out.println(normalArgs.add(2, 4, 3, 5, 6, 8, 9, 10, 12));

	}

}
