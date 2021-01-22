package com.java.learning;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class StudentCollection {

	private int sid;
	private String sname;

	/**
	 * @return the sid
	 */
	public int getSid() {
		return sid;
	}

	/**
	 * @param sid the sid to set
	 */
	public void setSid(int sid) {
		this.sid = sid;
	}

	/**
	 * @return the sname
	 */
	public String getSname() {
		return sname;
	}

	/**
	 * @param sname the sname to set
	 */
	public void setSname(String sname) {
		this.sname = sname;
	}

	/**
	 * @param sid
	 * @param sname
	 */
	public StudentCollection(int sid, String sname) {
		super();
		this.sid = sid;
		this.sname = sname;
	}

	@Override
	public String toString() {
		return "StudentCollection [sid=" + sid + ", sname=" + sname + "]";
	}

}

public class CollectionWithComparableInterface {

	public static void main(String[] args) {
		List<StudentCollection> stud = new ArrayList<>();
		StudentCollection s1 = new StudentCollection(1, "abc");
		StudentCollection s2 = new StudentCollection(2, "bcd");
		StudentCollection s3 = new StudentCollection(3, "cde");
		StudentCollection s4 = new StudentCollection(4, "def");
		StudentCollection s5 = new StudentCollection(5, "efg");

		stud.add(s1);
		stud.add(s2);
		stud.add(s3);
		stud.add(s4);
		stud.add(s5);
		
		Comparator<StudentCollection> studentIdComparator = (StudentCollection o1, StudentCollection o2) -> {
						
					if(o1.getSid() <  o2.getSid())
						return 1;
					else return -1;
					};

		stud.sort(studentIdComparator);
		
		for(StudentCollection studobj:stud)
		{
		System.out.println(studobj.toString());
		}
		
	}

}
