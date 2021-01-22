package com.java.learning;

/**
 * 
 *  we will implement the thread of class HiRunnable by using the runnable interface.
 * 
 * Functional interface: runnable is functional interface ie. run method only.
 * @author hp
 *
 */
/*
class HiRunnable implements Runnable{
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("Hi i m running using main thread");
			try {
				Thread.sleep(1000);// waitng for 1 sec
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
*/
//we can use lambda expression for the HiRunnable class as annonymous inner class.

/**
 * 
 * now the class become thread
 * 
 * @author hp
 *
 */
class HelloRunnable extends Thread {
	public void run() {
		for (int i = 0; i < 4; i++) {
			System.out.println("Hello i m using main thread");
			try {
				Thread.sleep(1000);// waitng for 1 sec
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class MultiThreadingUsingInterface {

	public static void main(String[] args) throws InterruptedException {
		/*
		 * Runnable hiobj = () -> { for (int i = 0; i < 5; i++) {
		 * System.out.println("Hi i m running using main thread"); try {
		 * Thread.sleep(1000);// waitng for 1 sec } catch (InterruptedException e) {
		 * e.printStackTrace(); } }
		 * 
		 * };
		 */
		// even we can also pass the runnable object under thread class
		Thread helloObj = new HelloRunnable();

//Runnable don't have start method so instead of calling start using obj,we can create thread object here.

		Thread t1 = new Thread(() -> {
			for (int i = 0; i < 5; i++) {
				System.out.println("Hi i m running using main thread");
				try {
					Thread.sleep(1000);// waitng for 1 sec
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}

		},"Hi-renamed thread using runnbale");
        
		//The range of priority is 1 to 10 1 is least and 10 is highest
		System.out.println(t1.getPriority());
		System.out.println(helloObj.getPriority());
		
		
		//we can change the thread priority
		helloObj.setPriority(10);
		System.out.println(helloObj.getPriority());
		
		//we can also set the name of thread and also get
		System.out.println("Thread 1:" + t1.getName());
		System.out.println("Thread 2:" + helloObj.getName());

		//when we create object of thread it will ask for two parameter runnable obj as well as name
		
		t1.start();// but it will not call the run method of class so if we pass object of the
					// class that implements runnable.we can configure it to use run.

		helloObj.start();

		// if we want to check if t1 is alive we can use isAlive()
		t1.join();
		helloObj.join();

		System.out.println(t1.isAlive());

		System.out.println("Bye");// main thread prints after thread1 and th2 prints one time, main will print.

		// but we want main to execute it after t1 and t2 will finish...therefore we
		// will use the the join method of thread so join will wait for the pt
		// when are two thread is done.

	}

}
