package com.java.learning;

/**
 * Theory:
 * 
 * MultiTasking: playing a song,doing a code or writing a document.
 * 
 * in One Task say Notepad ie. a process:
 * 
 * if we are tying a doucment and make a spelling mistake that means inside a
 * process of writing it is doing pselling check and writing.
 * 
 * that means it has some sub process which are known as thread.
 * 
 * Why Threads? Nowadays,we are living in octa-core processor ie. 8 core
 * now.When we run a java application..we only use one thread ie. MAIN thread.
 * 
 * by default,every java code we have exactly one thread "main".
 * 
 * now suppose if we hve an array of 500 elements and we want to multiply the
 * each element by 2...it may take 8sec....it will take ds much time.
 * 
 * now suppose if we want to use other extra core will can execute this work,so
 * we can create 4 different thread and main will call these 4 thread and dy
 * will be running parallely the task of 8 sec can be done within 2sec.
 * 
 * 
 * for eg: if we are surfing the app to search the shoe..if one thread is dre it
 * will search..meanwhile the amazon got logout ... thus not to expire the
 * session as well as to search the shoe ,we require the multithreading ie. main
 * thread will tke 2 thread may be one to interact with user and other to search
 * the shoe.
 * 
 * another eg: if we create web application using servelet ,server may request
 * the servelet it may be more than 5 user request the servlet so there also we
 * can implement the multithreading.
 * 
 * another eg: gaming: while developing we hve many thing to be done in a
 * sec..like moving,freids will be moving etc
 *
 *
 *
 * How Threading is done in java???
 *
 * 1.Thread t1=new Thread(); //but we have to tell the thread what to do.
 *
 * so we will create a class MyThread we will take the array and multiply each
 * by 2.
 *
 * but to acquire the real power of thread we should extend Thread class.
 *
 * now after creating the my thread object we can execute the run method. //but
 * it will not create thread for you.
 *
 * but if we call start method that will automatically call the run method.//and
 * will execute in parallel
 *
 * but what if i want to extends another class for mythread....it won't be
 * possible now because of multiple inheritance that's why we use interface
 *
 * ie.Runnable interface....which has run() method ,we can execute this method
 * and can also extends another class.
 *
 * MULTITHREADING IS AN IMPORTANT CONCEPT.
 *
 * Practical::: By default: main is the default thread. eveything we do ...is
 * done with main thread.
 * 
 */

class Hi extends Thread {
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

/**
 * 
 * now the class become thread
 * 
 * @author hp
 *
 */
class Hello extends Thread {
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

public class MultiThreadingDemo {

	public static void main(String[] args) {
		Hi hiobj = new Hi();
		Hello helloObj = new Hello();

//		hiobj.show();// main will go to this method and perform action
		// busy in waiting and executing and thus helloobj needs to wait
		// since there is no such dependency we can execute them parallel
		// the way we can do by making the class as thread
		hiobj.start();
		helloObj.start();
//		hiobj.run();// whenever we say start internally it is calling the run() method so instead of calling show method we should call run method
//		helloObj.run();// i want to achieve some pause ie.may be wait for some time

	}

}
