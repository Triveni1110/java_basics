package com.java.learning;

class AnnonymousDemo {
	public void show() {
		System.out.println("i m in annonymousDemo");
	}
}

/**
 * the purpose of this class is just to over ride the show method ,this can be
 * done by using anonymous inner class
 * 
 * @author hp
 *
 */
class AD1 extends AnnonymousDemo {
	public void show() {
		System.out.println("I m best");

	}
}

public class AnonymousInnerClass {

	public static void main(String[] args) {
		AnnonymousDemo ad = new AnnonymousDemo();
		ad.show(); // it will print i m in annonymousDemo
		// but i want to print "i m best"...and also i don't want to chnage the Class
		// AnonymousDemo

		// 1.one way to achieve this is to override the show() method. using ad1 class
		// 2.To make use of annonymous class

		AnnonymousDemo adRef = new AD1();
		adRef.show();

		AnnonymousDemo adRef1 = new AnnonymousDemo() {
			// this is annonymous class ie. class with no name
			// we first create obj and then class
			//when we just want to use the class for one time use
			public void show() {
				System.out.println("I m best");

			}
		};

		adRef1.show();
	}

}
