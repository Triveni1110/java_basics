package com.java.learning;

class AB {
	public AB() {
		System.out.println("IN A");
	}

	public AB(int i) {
		System.out.println("in parameterised A" + i);
	}
}

class BB extends AB {
	public BB() {
		System.out.println("in b");
	}

	public BB(int i) {
		super(i);
		System.out.println("in parmterised B" + i);
	}
}

public class SuperDemo {

	public static void main(String[] args) {
//creating object of sub-class, called the constructor of super calss as well.
		BB obj = new BB();

		// creating parameterised object,it will the parameterised constructor of its
		// own class
		// and default constructor of super class
		BB obj1 = new BB(1);

		System.out.println(
				"NO- Matter ,what type of contructor is called it waill always called the default constructor of super class");
		// but what if ,i don't want to call default constructor ,i want to call the
		// parameterised one.

		// why default is called???
		// every constructor in sub class has a method called super(),it will be by
		// default (given by compiler)
		// and dts why it is calling the efault constructor of super class

		// so if we pass parameter to the super method,we can call the parameterised
		// constructor
		System.out.println("we can call using super method and passing parameter");
	}

}
