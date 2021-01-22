package com.java.learning;

interface StaticDemo {
	static int num = 1;
	int roll = 4;

	public void show();

	default void show1() {
	}

	static void show2() {
		System.out.println("Non-static variable "+ roll + " static variable " +num);
	}
}

public class StaticMethodInInterface {

	public static void main(String[] args) {

		StaticDemo.show2();// we can't access the non-static field and ,methods
		// we have to use implementor class to access those fields

//		StaticDemo.roll = 7;// we can't change the roll value as by default every varibale defined under the
		// interface will be final.

//		StaticDemo.num = 44;//we can't change the static variable too.

	}

}
