package com.java.learning;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 
 * in java 1.7,we can ignore finally block we give () inside the try ()
 * 
 * @author hp
 *
 */
public class TryWithResources {

	public static void main(String[] args) {
		System.out.println("Enter the number");

		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			int num = Integer.parseInt(br.readLine());
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} 
/*		finally {
			// its use is to close the resource only but from java 1.7 we can skip finally
			// and we can use try with resource block ie. try with ()
			// and we can define the object dre itself ...we don't have to use final block
			// as it goes out of scope and close the resource
			// automatically
			try {
			br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		*/

	}

}
