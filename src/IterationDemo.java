
public class IterationDemo {
	public static void main(String args[]) {

		System.out.println(" star Sqaure demo");

		for (int row = 0; row <= 4; row++) {
			for (int col = 0; col <= 4; col++) {

				System.out.print(" " + row + " " + col + "* ");
			}
			System.out.println();
		}

		System.out.println("Triangular pattern (left align)");

		for (int row = 1; row <= 6; row++) {
			for (int col = 1; col <= row; col++) {
				System.out.print(col);
			}
			System.out.println();
		}

		System.out.println("Boundary square pattern");

		for (int row = 1; row <= 4; row++) {
			for (int col = 1; col <= 4; col++) {
				if (row == 1 ) {
					System.out.print("$");

				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

}
