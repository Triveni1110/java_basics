class Outer {

	// A class can have
	// 1.inner class
	// 2.Static inner class
	// 3.Anonymous class
	int a;

	public void show() {
		System.out.println("Outer class");
	}

//class inside a class known as inner class
	// Why inner class?
	// may be the purpose for both inner and outer as same,but specific like
	// constants
	class Inner {

		public void display() {
			System.out.println("In inner Class");
		}
	}

	static class StaticInner

	{

		public void showStatic() {
			System.out.println("In static inner class");
		}

	}
}

public class InnerClassDemo {

	public static void main(String[] args) {
		Outer outer = new Outer();
		outer.show();

		// we can't access the inner class,i is inside the outer class
		// to access the inner class we have to use Outer.Inner in lft hand side
		// and in order to create the object of inner class we should refer the obj of
		// outer class
		Outer.Inner inner = outer.new Inner();
		inner.display();

		Outer.StaticInner staticInner = new Outer.StaticInner();
		staticInner.showStatic();

	}

}
