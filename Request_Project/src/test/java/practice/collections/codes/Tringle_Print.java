package practice.collections.codes;

public class Tringle_Print {
	// Java code to demonstrate star patterns
	// Function to demonstrate printing pattern
	public static void printStars(int n) {
		int i, j;
		// outer loop to handle number of rows
		// n in this case
		for (i = 0; i < n; i++) {
			// inner loop to handle number of columns
			// values changing acc. to outer loop
			for (j = 0; j <= i; j++) {
				// printing stars
				System.out.print(" * ");
			}
			// ending line after each row
			System.out.println();
		}
	}

	// Function to demonstrate printing pattern
	public static void printStars1(int n) {
		int i, j;
		// outer loop to handle number of rows
		// n in this case
		for (i = 0; i < n; i++) {
			// inner loop to handle number spaces
			// values changing acc. to requirement
			for (j = 2 * (n - i); j >= 0; j--) {
				// printing spaces
				System.out.print(" ");
			}
			// inner loop to handle number of columns
			// values changing acc. to outer loop
			for (j = 0; j <= i; j++) {
				// printing stars
				System.out.print("* ");
			}
			// ending line after each row
			System.out.println();
		}
	}

	// Function to demonstrate printing pattern
	public static void printTriangle(int n) {
		// outer loop to handle number of rows
		// n in this case
		for (int i = 0; i < n; i++) {

			// inner loop to handle number spaces
			// values changing acc. to requirement
			for (int j = n - i; j > 1; j--) {
				// printing spaces
				System.out.print(" ");
			}

			// inner loop to handle number of columns
			// values changing acc. to outer loop
			for (int j = 0; j <= i; j++) {
				// printing stars
				System.out.print("* ");
			}

			// ending line after each row
			System.out.println();
		}
	}

	public static void mains() {
		int rows = 7; // Number of Rows we want to print
		// Printing the pattern
		for (int i = 1; i <= rows; i++) {
			for (int j = 1; j < i; j++) {
				System.out.print(" ");
			}
			for (int j = i; j <= rows; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}

	public static void main1() {
		int rows = 7; // Number of Rows we want to print
		// Printing the pattern
		for (int i = 1; i <= rows; i++) {
			for (int j = 1; j < i; j++) {
				System.out.print(" ");
			}
			for (int j = i; j <= rows; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		// Printing the reverse pattern
		for (int i = rows - 1; i >= 1; i--) {
			for (int j = 1; j < i; j++) {
				System.out.print(" ");
			}
			for (int j = i; j <= rows; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}

	}

	// Driver Function
	public static void main(String args[]) {
		int n = 5;
		printStars(n);
		printStars1(n);
		printTriangle(n);
		main1();
		mains();
	}
}
