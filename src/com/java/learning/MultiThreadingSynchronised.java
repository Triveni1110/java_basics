package com.java.learning;

/**
 * Synchronisation: eg: we have a class counter,we have a variable count and a
 * method counter which weill increase count ++;
 * 
 * we will use its object in main to increment
 * 
 * after that we can see the count will be 1. because we are calling only
 * once.....if we call multiple time..it will be multiple value.
 * 
 * so we can create another thread to execute this function and write its
 * execution we will write in run() method.
 * 
 * but we are not getting fixed value as variable.
 * 
 * after using join with main thread...it will print 1000.
 * 
 * we want another thread that will run parallel to count it 2000.
 * 
 * again......we join these two with main...but we are not getting 2000(expected
 * count)
 * 
 * when two thread doing execution at d same time...at some point both thread
 * took the same value and incremented from there however it should not be the
 * case,one thread should enter the function once at a time.
 * 
 * To implements this,we use synchronised keyword for the function method which
 * is increasing the count value.
 * 
 * now it will be performed effeciently and answr got is crrct.
 * 
 * @author hp
 *
 */
class Counter {
	int count = 0;

	 public synchronized void increment() {
		count++;//it is not the smple statement as it involves two operation ie. increse by 1 and assign it to variable
	}

}

public class MultiThreadingSynchronised {

	public static void main(String[] args) throws InterruptedException {
		
		Counter c = new Counter();
				
		Thread t = new Thread(()-> {
			
				for(int i=0;i<1000;i++)
				{
				c.increment();
				}
		} );
		
		
		Thread t2=new Thread(() -> {
			for(int i=0;i<1000;i++)
				c.increment();
		});   
		t.start();
		t2.start();
		
		t.join();
	    t2.join();
		System.out.println("" + c.count);
	}

}
