package com.java.learning;

public class MyOwnException extends Exception {
	
	MyOwnException(String message){
		// because exception class is also having message property that need to get modified by our custom message
		super(message);
		
	}

}
