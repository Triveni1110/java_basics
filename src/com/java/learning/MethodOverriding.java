package com.java.learning;

class SuperClass {
	public void show() {
		System.out.println("in a");
	}
}

class SubClass extends SuperClass {
	// the method which over ride the super class method by using annotation
	// @override .This can tell you compilation error such as spelling mistakeand
	// on.

	@Override
	public void show() {
//		super.show();
		System.out.println("in b");
	}

	public void config() {
		System.out.println("in b config");
	}
}

class SubClass2 extends SuperClass {
	public void show() {
		System.out.println("in hsow -c");
	}

}

public class MethodOverriding {

	public static void main(String[] args) {
		System.out.println("Method OverRiding");

		SubClass obj = new SubClass();
		// class b method show over ride the super class method show.
		obj.show();

		// but if we want to call both method show from both class we can add
		// super.show() method inside the subclass show method.
		obj.show();

		System.out.println("Dyamic mismatch");
		// normally object of a super class
		SuperClass sc1 = new SuperClass();
		SubClass sb1 = new SubClass();
		// how to create reference of super class and object of sub class
		SuperClass sc = new SubClass();//runtime linking

		sc.show();//which method to call,is run time polymorphism

		// sc.config(); we can't call config ,thus we can only call method of a only
	     sc=new SubClass2();
	     
	     sc.show();//dynamic method dispatch
		
		// reference of sub and obj of super
//		SubClass sb = new SuperClass();
	     
	     
	     //polymorphism: runtime and compile time
	     
	}

}
