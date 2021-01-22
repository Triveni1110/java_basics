package com.java.learning;

/**
 * Exception:
 * 
 * 1.Unchecked Exception 2.Checked Exception
 * 
 * Unchecked Exception: whenever there is exception ,compiler will no notify
 * about this exception as a=0/0 (divide by zero)
 * 
 * exception is breaking the execution of program,it is the responsibility of
 * developer to handle the exception for normal flow of execution.
 * 
 * To handle the exception,
 * 
 * 1.Try-Catch: try is the block where we put critical statement thatmay throw
 * an exception and catch block need to catch the exception object that will be
 * thrown by try block.
 * 
 * we can also specify the type of exception ie. arithmetic exception or etc
 * 
 * @author hp
 *
 */
public class ExceptionDemo {

	public static void main(String[] args) {
		try {
			int i = 1;
			int j = 4;
			int k = i / j; // normally it is exception that is getting noticed runtime
			System.out.println(k);
//			System.out.println("we want this common");//code redundancy
		} catch (Exception e) {
//			System.out.println("we want this common");//code redundancy so we can avoid this by the use of finally block,that will get executed even exception occur or not
			System.err.println("Exception ::: " + e);
		}finally{
			System.out.println("we want this common");//code redundancy
		}
		
	}

}
