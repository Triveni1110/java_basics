package com.java.basic;

public class StringConcatenation {

	public static void main(String[] args) {
		String test1 = "abcdefthg";

		String test2 = null;
		test2 = (test2 == null) ? "" : test2;
		String concatTest = test1.concat(test2);
		System.out.println(concatTest);
	}

}
