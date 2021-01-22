package com.java.learning;

interface Writer {

	abstract public void write();
	// since this method is not doing anything we can make it abstract,
	// by default,all method in the interface are public and abstract.
}

abstract class ABC {
	void showNon() {

	}

	abstract void show();
}

//class Pen extends Writer,ABC { WE CAN'T EXTTENDS MULTIPLE CLASS,ie java doesn't support the multiple inheritance
//so we can make writer as interface and another calss as abstract
class Pen extends ABC implements Writer {

	public void write() {
		System.out.println("i m pen");
	}

	@Override
	void show() {
		// TODO Auto-generated method stub

	}
}

class Pencil extends ABC implements Writer {
	public void write() {
		System.out.println("i m pencil");
	}

	@Override
	void show() {
		// TODO Auto-generated method stub

	}
}

class Kit {
	public void doSomething(Writer p) {
		p.write();
	}
}

public class InterfaceDemo {

	public static void main(String[] args) {
		System.out.println("Interface-when,what,how..? to use");

		Kit k = new Kit();
		Pen p = new Pen();
		k.doSomething(p);

		// now what when we pass pencil object,we won't be able to pass the object
		// so i m creating the class Writer which will be extended by the subclass and
		// this class should have the shared method ie.write()
		// we can create refrence of super and obj of sub and we cn pass.

		Writer w = new Pencil();
		Writer w2 = new Pen();
		k.doSomething(w);

		// DIFFERENCE BETWEEN ABSTRACT AND INTERFACE CLASS:
		// 1. abstract class can have abstract as well as non-abstract method
		// 2.but in interface we can not define any method
		// 3.By default every method inside the interface all by default public as well
		// as abstract.

		// Whenever u work with interfce,implements is used
		// We can never create the object of interface but we can create the reference
		// as same as abstract
		// we can achieve multiple inheritance in the interface,but not with the class
	}

}
