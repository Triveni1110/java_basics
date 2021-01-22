package com.java.learning;

/**
 * 
 * In abstract class,we can define method only using abstract and also we can
 * define the method In interface ,we can only declare method but can't define
 * (till java 7)
 * 
 * But things are changing thus new features are added to classes,interfaces or
 * other things. But we are not allowed to make change the interface.
 * 
 * 
 * But after java 1.8 we can define the method inside the interface using
 * default keyword.
 * 
 * why we have interface and abstract now...if we can define method..?
 * 
 * functional interface may have more than one method but only one abstract
 * method.
 *
 *
 * drawback if we define more than one method inside interface:
 */
@FunctionalInterface
interface Demo {
	void add();

	default void show() {

		System.out.println(
				"hey now in interface we can define the method by  using default keyword before the abstract method");
	}

}

interface MyDemo {
	default void show() {

		System.out.println(
				"hey now in interface we can define the method by  using default keyword before the abstract method");
	}
}

/**
 * Since i m implementing the two interface which are having deafult method
 * "show",which will cause ambiguity Different method with same parameter to avoid this
 * 
 * Solution: create a method as show inside the impl class
 * we can also mention interface.super.method as well.
 * 
 * @author hp
 *
 */
class DemoImpl implements Demo, MyDemo {

	@Override
	public void add() {
		System.out.println(
				"I am the method which is not using default keyword thus it is required to implement in the demo impl class");

	}

	@Override
	public void show() {

		System.out.println("in impl show");
		// what if i want to call super class method show ie.demo.show

		Demo.super.show();
	}
}

public class DefaultMethodInterface {

	public static void main(String[] args) {

		Demo demo = new DemoImpl();
		demo.add();
		System.out.println("   ");
		demo.show();

	}

}
