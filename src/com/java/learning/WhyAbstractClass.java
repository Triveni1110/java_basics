package com.java.learning;

class NumberDemo {

	public void show(Integer i) {
		System.out.println("i" + i);
	}

	public void show(Double d) {
		System.out.println(d);
	}

	/**
	 * This method will take any type of number parameter, it cn accept all the
	 * subclass object.
	 * 
	 * @param n
	 */
	public void show(Number n) {
		System.out.println(n);
	}
}

public class WhyAbstractClass {

	public static void main(String[] args) {
		NumberDemo nd = new NumberDemo();
		nd.show(6);
		// butu what if i want to pass double valuse such as 7.5
		// so i need another method that will accept the double parameter.
		nd.show(7.9d);
		// but why are we using the two fucntion..can anything be genrally specific to
		// the number
		// yes it is Number class which is abstract class,thus we dont make object of
		// Number,but Integer and Double ie.subClass can make use of this class
		nd.show(577.66f);

	}

}
