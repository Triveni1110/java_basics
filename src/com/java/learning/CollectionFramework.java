package com.java.learning;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/**
 * Collection and generic
 * 
 * collection is the concept Collection is the interface. Collections is the
 * class
 * 
 * to store 5 elements, 1. array
 * 
 * problem: the size of array is fixed,we don't want to be fixed may be in
 * future it will be 100 or 2.
 *
 * so,instead of working with arrya we work with collection.
 * 
 * Collection (interface) values = new ArrayList<>{}; so ArrayList is the class
 * that implement the collection interface because interface can't make object.
 * 
 * values.add(); //we can add as much we want we can add different data type but
 * if we want to make type specific we have to use generic
 * 
 * Collection interface<Integer> values=new ArrayList<Integer>(); //Data type
 * specific
 * 
 * () : that is for parameter {} : thats reserved for defination may be for
 * class ,method or interface [] : that is reserved for array <> : for generics
 * 
 * so after java 1.7 we can skip Right hand side Integer type .
 * 
 * 
 * why?
 * 
 * if fixed elements,then go to array (as fast ) if size not fixed. then go to
 * list.
 * 
 * 
 * But can you delete elements or you want to element between two known element
 * ? we can't specify the index no..we can add element in between
 * 
 * in order to work with index number so we will implement list to work with
 * this.
 * 
 * instead of using list we can also use set. Set<Integer> number= new
 * HashSet<Integer>();
 * 
 * advantage: we will have set of unique value. the order we will get is not the
 * same we entered the elements.
 * 
 * so instead of using Hash set we can use TreeSet.
 * 
 * if we add element in any order ,but we will be getting the element in sorted
 * order.
 * 
 * 
 * another thing is "MAP" .... advantage: inside list->duplicate elemnt and we
 * can have unique index no for every element but inside map the key () will be
 * specific to the value. every value will be having a key..that can be
 * integer,string etc.
 * 
 * Map is interface can be implemented by HashMap
 * 
 * Map<Integer,String> kmap=new HashMap<>();
 * 
 * 
 * THHIS IS COLLECTION INTERFACE CODE
 * 
 * 
 * @author hp
 *
 */
/*
 * class MyComparator implements Comparator{
 * 
 * @Override public int compare(Object o1, Object o2) { //write logic }
 * 
 * }
 */
public class CollectionFramework {

	public static void main(String[] args) {
		
		Collection collection = new ArrayList<>();

		collection.add(1);
		collection.add("string");
		collection.add(4.5f);
		
		//collection don't support index number.
		//we can't fetch with index number
		System.out.println(collection);
		
		//so to fetch the value with index number with the help of itarator interfcae.
		
		Iterator it=collection.iterator();
		/*
		System.out.println(it.next());
		System.out.println(it.next());
		System.out.println(it.next());//but we know how many sysout we have to write so we will apply while loop
		*/
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		//the problem is it doesn't support index number,if we don't have index number if we want to add an element in between after string and 4.5
		//but we can't do dt.
		
		//so we can use one more interface ie. List interface which extends collection interface (feature of collection and list)
        // ArrayList implements List (indirectly implements collection)		
		
		List listValue=new ArrayList<>(); 
		listValue.add(1);//wrapper class object
		listValue.add("string"); // string class object
		listValue.add(4.5f);//float object
		//we can work with iterator as well and for loop or enhanced for loop
		
		listValue.add(1, "i got aded between 1 and string");//String object
		
		for(Object o:listValue)
		{
			System.out.println(o);
		}
		
		//we can make collection with generics(type specific):::: 
		
		List<Integer> integerList=new ArrayList<>();
		integerList.add(1);
//		integerList.add(78.23);//won't accept
		integerList.add(34);
		integerList.add(4);
		integerList.add(7);
		integerList.add(35);
		
		
		
		
		//--------------------------------------------------
		
		/*
		 * the order in which we enter the value we get that order
		 * 
		 * but in collection is an api concept we have something called
		 * Collection class which is having methods.
		 * such as sort which is staticmethod.we can pass the list which will give the sorted order.
		 * 
		 * we can also reverse means decreasing order.
		 * 
		 * that is we can changing the index value of elements.
		 * 
		 * which is why list is called muttable.
		 * 
		 * String api is unmuttable api.
		 * 
		 * */
		
		//we can't sort colletion list ie.non-generic 
		Collections.sort(integerList);
		Collections.reverse(integerList);
		
		
		//but what if i want to sort the element using last digit.
		// i need to change the sort result.
		//if we go to the sort method, which is using the list  elements.
		
		//means if we want to sort the integer,integer class is implementing the comparable interface.
		// The comparable interface will define logic for sorting,in this interface we have a method compare to
		//which is implemented by integer class.
		
		
		//if order to write logic that we want to specify for comparision,we can override the logic that is compareto method defined by integer class.
		// Comparator object willhave logic.
		
		//Since comparator is an interface we won'tbe able to create object pof interface and there is no class in collection
		//that can be used to implemt this.
		//so we have to create a class which can implement the comparator interface and 
		
		//so we have created inner class
		Comparator<Integer> c = (Integer o1, Integer o2) -> { 
				if(o1%10 > o2%10)
				return 1;
				else return -1;
			
			};

		
		Collections.sort(integerList, c);
		System.out.println(integerList);
	}

}
