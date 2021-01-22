/**
 * 
 */
package com.java.learning;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 * key-value pairing : map
 *
 */
public class MapDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Map<Integer, String> m = new HashMap<>();
		m.put(1, "helllo");
		m.put(2, "name");
		m.put(5, "id");
		m.put(3, "class");
		m.put(4, "school");
		System.out.println(m);

		Map<Integer, String> m1 = new TreeMap<>();
		m1.put(1, "helllo");
		m1.put(5, "name");
		m1.put(2, "id");
		m1.put(3, "class");
		m1.put(4, "school");
		m1.put(4, "school1");
		m1.put(6, "school2");
		System.out.println(m1);

		Set<Integer> keySet = m1.keySet();// key value can't repeat but value can repeat

		for (Integer key : keySet) {
			System.out.println(m1.get(key));
		}

//hash table is synchronised but hashmap
		// thread safety got to hash table else go to hash map
		Map<Integer, String> m2 = new Hashtable<>();
		m2.put(1, "helllo");
		m2.put(5, "name");
		m2.put(2, "id");
		m2.put(3, "class");
		m2.put(4, "school");
		m2.put(4, "school1");
		m2.put(6, "school2");
		System.out.println(m2);

	}

}
