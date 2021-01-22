package com.java.learning;

//int ,float,double : primitive data type 
// it comes from c,where data is stored in primitive data format.
//but in java,eveything should be in  object
public class WrapperClass {

	public static void main(String[] args) {
		int i = 5;
		// so instead of using int we must be using the class for the sameie.Integer

		// these class are the sub class of NumberClass
		// Number class contains many method and subclass
		Integer ii = new Integer(5);// wrapper class
		Float f = new Float(4.4f);
		Double d = new Double(3445.666d);

		Integer boxing = new Integer(i);// putting primitive in the warpping ,this concept is called boxing or wrapping
		Integer autoBoxing = i;// this is called autoboxing java will do new part
		int unboxing = boxing.intValue();// taking out the value from object
		int autoUnboxing = boxing;// autoUnboxing

		// but in terms of speed,primitive are so fast as compare to the wrapper class
		// then y to use...?
		// because many frameworks works with wrapper class such as hibernate,collection
		// totally depends on the demand

		String string1 = "463612";

		Integer numFromString = Integer.parseInt(string1);
		System.out.println(numFromString);

	}

}
