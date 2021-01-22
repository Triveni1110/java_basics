package com.java.learning;

abstract class Human {
	// if you make class abstract,and method also don't have method defination so we
	// can only declare the method .
	public void eat() {
	}

	/*
	 * whenever you have abstract method,the class must be absract but its not
	 * compulsory to have abstract method in order to be abstract class
	 */
	public abstract void drink();
}

class Man extends Human {// it is called concrete class

	//if we fail to define the over-ride methd ,then sub classs will again be an abstract class
	@Override
	public void drink() {
		System.out.println("in man");

	}
}

public class AbstractDemo {

	public static void main(String[] args) {

		System.out.println("Abstract keyword: abstract class,abstract method");

//		Human obj = new Human();

		// since human does not have any implemented method
		// we don't wnat anyone to create object,this class is built to get extented to
		// be used by another class
		// so we can make the human class as abstract class, no one can mke the obj of
		// the abstract class

		Human m = new Man();// allowed
		m.drink();

		Man m2 = new Man();
		// we can't have object of abstract class
	}

}
