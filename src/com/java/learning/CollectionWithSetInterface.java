package com.java.learning;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * 
 * Inside set, also we can have collection of element.
 * 
 * the main difference between set and list.
 * 
 * the set will not contain duplicate elements
 * 
 * @author hp
 *
 */
public class CollectionWithSetInterface {

	public static void main(String[] args) {

		//hash set will use hashing concept, whenevr value is saved inside heap memory ,
		//it goes to a location and hashing must be using some algo because of which it is fetching value.
		//the sequence returned is not ordered.
		Set<Integer> valueSet = new HashSet<>();
		valueSet.add(5);
		valueSet.add(7);
		valueSet.add(3);
		valueSet.add(32);
		valueSet.add(1);
		valueSet.add(9);
		valueSet.add(5);//it will return false
		
		System.out.println(valueSet);
		
		//so we can use tree set.
		
		Set<Integer> valueTreeSet=new TreeSet<>();
		valueTreeSet.add(5);
		valueTreeSet.add(7);
		valueTreeSet.add(3);
		valueTreeSet.add(32);
		valueTreeSet.add(1);
		valueTreeSet.add(9);
		valueTreeSet.add(5);//it will return false
		
		System.out.println(valueTreeSet);
		
		
		

	}

}
