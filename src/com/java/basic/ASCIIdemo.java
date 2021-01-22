package com.java.basic;

/**
 * The ASCII Value of any character(ie. digits(0-9),symbol,atoz or A to Z) can be retreived via typecasting to int.
 * 
 * @author hp
 *
 */
public class ASCIIdemo {

	public static void main(String args[]) 
		{  
			for(int i = 0; i <= 255; i++)  
			{  
			System.out.println(" The ASCII value of " + (char)i + "  =  " + i);  
			}  
			System.out.println("==============================");
			for(char i = 'A'; i <= 'Z'; i++)  
			{  
			System.out.println(" The ASCII value of " + i + "  =  " + (int)i);  
			}  
		}
	

}
