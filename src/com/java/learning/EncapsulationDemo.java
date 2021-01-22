package com.java.learning;

class StudentOne {
	private int sid;
	private String sname;

	public void setSid(int sid) {

		this.sid = sid;
	}

	public int getSid() {
		return sid;
	}

	public void setSname(String sname) {

		this.sname = sname;
	}

	public String getSname() {
		return sname;
	}
}

public class EncapsulationDemo {

	public static void main(String[] args) {

		// Wtever we use to work with the sid and snme can be done only with method not
		// directly.

		StudentOne s1 = new StudentOne();// after making private we can't access directly
//		s1.sid = 2;
//		s1.sname = "ram";

		// so we will use getter and setter for d same

		System.out.println("sid:" + s1.getSid() + "sname: " + s1.getSname());

		// GOOD PRACTICE
		// we should make our variable private so that they can not be accessed from
		// outside and method can be public ie.BINDING METHOD WITH THE METHODS,this
		// concept is called (Encapsulation)

		// Why Encapsulation???

		// TO keep the data safe,data abstraction we cn maintan log file each time value
		// is getting changed
		// before access the variable ,we can cross chck the authenticity,if allowed to
		// access or not
	}

}
