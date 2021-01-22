package com.java.learning;

import com.java.pattern.EmployeePacakge;

/**
 * 
 * Access Specifers, in java there is nothing called access specifiers it is dre
 * in c or c++
 * 
 * but in java we have access modifiers.
 * 
 * 1.final 2.abstract 3.public 4.private 5.protected
 * 
 * TO Class,
 * 
 * we can use only final,abstract and public we can not use private or protected
 * but if we use inner class we can use private access modifiers
 * 
 * if we don't specify it is called default class . default access modifier but
 * we can not use the class outside of the package.
 * 
 * To Method and variable ,
 * 
 * we can use public,abstract,private,protected,final but if we don't mention
 * these things by default it will be default access modifiers we won't be able
 * to use it outside of the package.
 * 
 * 
 * But normally,we are using concept of encapsulation, so variable can be
 * private but method can be public or private if public only when we want to
 * access it outside of package
 * 
 * 
 * private: specific class. default :specific package. public :any class or
 * package protected : Subsiding class it can only used in the subsiding ie.sub
 * class or sub package.
 * 
 * 
 */

public class AccessModifiers {

	public static void main(String[] args) {

		EmployeePacakge s = new EmployeePacakge();

		s.rollNo = 4;// we can acess as the variable is having public access modifiers
//		s.name="hjgjhdgf"; //we can't access as the variable is private
	}

}
