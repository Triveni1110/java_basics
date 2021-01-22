package com.java.basic;

import java.util.Arrays;
import java.util.Random;

/**
 * There are various way to genrate random number in java.
 * 
 * 1. Using java.util.Random class 2.using math.random() function
 * 
 * @author hp
 *
 */
public class RandomNumber {

	public static void main(String[] args) {

		Random random = new Random();
		System.out.println(random.nextInt(23));
		System.out.println(random.nextBoolean());
		System.out.println(random.nextDouble());
		System.out.println(random.nextFloat());
		System.out.println(random.nextGaussian());
		System.out.println(random.nextLong());
		int[] rndmintary = random.ints(10, 12, 24).toArray();
		Arrays.sort(random.ints(10, 12, 24).toArray());

		for (Integer i : rndmintary) {
			System.out.println(i);
		}

		System.out.println(Math.random());

		Integer obj1 = 5;
		float obj2 = 5;
		Double obj3 = 5d;
		System.out.println(obj1.hashCode());
		System.out.println(obj3.hashCode());
		System.out.println(obj1.equals(obj2));
	}

}
