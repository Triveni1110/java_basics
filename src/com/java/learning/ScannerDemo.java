package com.java.learning;

import java.util.Scanner;

/**
 * 
 * Scanner is very advanced we have buffered reader system...etc
 * 
 * but we need something short and simple.
 * 
 * 
 * need not to handle exception 
 * need not to convert to int or string
 * 
 * 
 * @author hp
 *
 */
public class ScannerDemo {

	public static void main(String[] args) {

		// we have to specify from where we are getting input may be from file,network and may be from keyboard ie. System.in
		Scanner scan = new Scanner(System.in);
		
		scan.nextLine();
		System.out.print(scan.nextLine());

	}

}
