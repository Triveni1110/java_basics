package com.java.learning;

final class Test {

	int i = 9;

	final double pi;// we don't want to get change it at any point.....but what if i don't assign
					// the here
	// same i cn do in the constructor

	public Test() {
		i = 10;
		pi = 1.09;// when the final variableis initiliased inside the constructor block,we can
					// refer that variable as CONSTANTS
		
//		pi=353;//we cn't chnge final variable after its initialisation
	}

	public void show() {
	}

}

/*
 * class Test2 extends Test {// as if it extends it can take credit
 * 
 * // we can't extends Test if Test is final
 * 
 * but still if its okhy to extend the class but we don't want the sub class to over ride the method, we
 * can use final with method.
 * 
 * }
 * 
 */
public class FinalDemo {
	public static void main(String args[]) {
		System.out.println("Final-variable,method,class");

		Test test = new Test();
		System.out.println(test.i);
	}

}
