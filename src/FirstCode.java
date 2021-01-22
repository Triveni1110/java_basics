public class FirstCode {
	public static void main(String[] args) {
		int a=5;//32-bit
		char c=66;//16-bit
		long l=34;//64-bit
		float f=56f;//32-bit
		double d=24.7899;//64-bit
		boolean bo=true;//1-bit
		byte by=0;//8-bit
		short s=12;
		
		
		System.out.println(""+a+c+l+d+bo+by+s);
		System.out.println(""+ (a+d+f));
		System.out.println("Hello World");
		
		
		/*operator demo
		 * 
		 * Arihmetic: +,-,*,/,%
		 * Bitwise ()
		 * Relational ()
		 * Logical  
		 * 
		 * */
		System.out.println("Operator Demo");
     int num1=2;
     int num2=3;
     
     int sum=num1+num2;
     int diff=num1-num2;
     int mul=num1*num2;
     int div=num1/num2;
     int mod=num1%num2;
     
     System.out.println("add "+sum+"  diff "+diff+" mul "+mul+" div "+div+" mod "+mod);
     
     System.out.println("Increment operator/decrement operator");
     
     System.out.println("post-increment"+ num1++);//while reading,its will frst print num1=2 and then it will increse
     System.out.println("Pre-increment"+ ++num1);//while reading..it will first increment and then print
     
     System.out.println("pre-decrement"+ --num1);
     System.out.println("post-decrement"+ num1-- );
	
	}
}
