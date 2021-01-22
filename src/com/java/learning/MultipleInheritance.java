package com.java.learning;

class A {
	void show() {
	};
}

class B {
	void show() {
	};

}

class C extends A {

}

public class MultipleInheritance {

	public static void main(String[] args) {
		C c = new C();
		c.show();// which show method will be called

		System.out.println(
				"There will be ambiguity to call the show method from c obj refernce as both a and  b are having show method");
		System.out.println("Thus to overcome this ambiguity,we should not have multiple inheritance in java");

	}

}
