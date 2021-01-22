package com.java.learning;

class Calculator// Parent,super,base
{
	public int add(int i, int j) {
		return i + j;
	}
}

//SINGLE LEVEL INHERITANCE
//sub,child,derived class
class CalculatorAdvanced extends Calculator {

	// CODE REDUNDANCY
	/*
	 * public int add(int i, int j) { return i + j; }
	 */

//we can use feature of the exixting class file
	public int sub(int i, int j) {
		return i - j;
	}
}

//MULTI-LEVEL INHERITANCE
class CalculatorAdvancedTwo extends CalculatorAdvanced {

	public int mul(int i, int j) {
		return i * j;

	}
}

public class InheritanceDemo {

	public static void main(String[] args) {

		CalculatorAdvanced c = new CalculatorAdvanced();
		c.add(3, 4);
		c.sub(5, 6);

		// in this class m havng object of another class
		CalculatorAdvancedTwo advnce = new CalculatorAdvancedTwo();
		advnce.add(3, 4);
		advnce.sub(6, 9);
		advnce.mul(4, 6);
	}
     //INHERITANCE is of two type 
	// 1.IS-A (The class which extends another class)
	// 2.HAS-A (The class which has object of the another class is called has-a)
}
