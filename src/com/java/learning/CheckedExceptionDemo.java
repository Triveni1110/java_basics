package com.java.learning;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 
 * IO FILE exception it is encoutered during compile time also ie called Checked
 * Exception
 * 
 * Only Runtime exception subclasses are unchecked other are checked exception.
 * 
 * we can handle using try catch or using throws keyword
 * 
 * 
 * 
 * we should handle resources exception:
 * 
 * create in try catch handle it in catch and close in finally
 * 
 * @author hp
 *
 */
public class CheckedExceptionDemo {

	public static void main(String[] args) {

		System.out.println("Enter the number");

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		try {
			int num = Integer.parseInt(br.readLine());
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
