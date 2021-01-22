package com.java.learning;

/**
 * 
 * Type of interface: 1.Normal Interface eg: interface have more than one abstract method
 * 2.Single abstract method(SAM INTERFACE) eg. Functional Interface ie interface
 * only one abstract method 3.Marker Interface( interface doesn't have any method ) eg.
 * Serializable till 1.7 we have all 3 from 1.8 we do hve SAM, Specifically
 * known as Functional Interface
 * 
 * @author hp
 *
 */

//why annotation?
//we can skip also,but may be due to mistake if we add one more method hen that won't be a functional interface.

/**
 * This is a functional interface as it only have one method
 * 
 * @author hp
 *
 */
@FunctionalInterface
interface FunctionalInterfaceTest {
	void show();
}

public class FunctionalInterfaceDemo {

	public static void main(String[] args) {

		// if you know Functional interface,we can use features are lambda etc.
		// lambda expression concepts is coming from scala language
		// java adapted scala,thus java 1.8 added scala features

		FunctionalInterfaceTest test =
				// this is a boiler plate code
				new FunctionalInterfaceTest() {

					@Override
					public void show() {
						System.out.println("i m boiler plate code where i m using the new keyword");
					}
				};

		test.show();

		//new line is automated,and bracket works as a function call and curly braces is the method defination
		FunctionalInterfaceTest lambdaTest = () -> {
			System.out.println(
					"I m using lambda expression in which () is pointing the method the functioanl interface ie. show()"
							+ " and the line in the curly brace represents the method defination ");
		};

		lambdaTest.show();
		// we can acheive this lambda epxression only for functional interface,we can't
		// achieve in the normal interface beacuse it will be confusion to understand
		// which method is defined
		// we can remove curly barces and semi-colon beacuse there is no need,there is
		// only one line
	}

}
