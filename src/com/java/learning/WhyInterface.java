package com.java.learning;

interface TestInterface {
	void show();
}

class TestImplementor implements TestInterface {

	@Override
	public void show() {
		System.out.println("i implements interface");

	}
}

public class WhyInterface {

	public static void main(String[] args) {
		// 1.to achieve the concept of generalization
		// lets sy there is a manger,who has given a project to developer
		// so wt all feature will be dre?
		// wt manger will do he will create interface
		// method defination or developmnet will be done by the developer

		// Api-application programming interface,which are the class that needs to be
		// done or work to implement functionality

		TestInterface i = new TestImplementor();
		i.show();
		// annonymous inner class

		TestInterface ti = new TestInterface() {

			@Override
			public void show() {
				System.out.println("i m best");

			}
		};
         //the class will be used only this scope.
		// so yes we can create object of interface using anonnymous class
		ti.show();

	}

}
