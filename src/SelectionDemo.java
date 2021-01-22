import java.util.Scanner;

public class SelectionDemo {

	public static void main(String[] args) {

		// if-else
		Scanner scan = new Scanner(System.in);

		int a = scan.nextInt();
		while ((a--) > 0) {
			if (a % 2 == 0) {
				System.out.println("No is even" + a);
			} else {
				System.out.println("No is odd" + a);
			}
		}
		// ternary operator:=> ? :
		int a2 = scan.nextInt();
		System.out.println("do while ");
		do {
			int ternary = (a2 % 2 == 0) ? 0 : -1;
			System.out.println(ternary);
		} while ((a2--) > 0);

		// Switch demo
		System.out.println("Enter the no of replay you want:::");
		int replay = scan.nextInt();
		while (replay > 0) {
			System.out.println("Welcome to the java Switch conditional statement");
			System.out.println("1.Even/Odd");
			System.out.println("2.Table of a number");
			System.out.println("3.Sum of digit of a number");
			int choice = scan.nextInt();

			switch (choice) {

			case 1:
				System.out.println("You chose Even/odd");
				int num1 = scan.nextInt();
				int result = (num1 % 2 == 0) ? 0 : -1;
				System.out.println("0: even and -1:odd" + result);
				break;

			case 2:
				System.out.println("table of a number");
				int num2 = scan.nextInt();
				int i = 10;
				while (i > 0) {
					System.out.println("" + num2 + "x" + i + "=" + num2 * i);
					i--;

				}
				break;
			case 3:
				System.out.println("Sum of digit");
				int num3 = scan.nextInt();
				int sum = 0;
				int countOfDigit = 0;
				while (num3 > 0) {
					countOfDigit++;
					int lastDigit = num3 % 10;
					num3 = num3 / 10;
					sum = sum + lastDigit;
				}
				System.out.println("Digit in number:" + countOfDigit);

				System.out.println("Sum" + sum);
				break;

			default:
				System.out.println("Default choice");
			}

		}
		replay--;
	}

}
