package practice.collections.codes;

public class factorialNumber {

	static int factorial(int n) {
		if (n == 0)
			return 1;
		else
			return (n * factorial(n - 1));
	}

	public static void main(String[] args) {
		System.out.println(factorial(12));
		System.out.println(factorial2(12));

	}

	public static long factorial2(int i) {

		if (i < 0)
			throw new IllegalArgumentException("x must be >= 0");
		return i == 0 || i == 1 ? 1 : i * factorial(i - 1);
	}

	
	public static void mains() {
		int fact = 1;
		int number = 12;// It is the number to calculate factorial
		fact = factorial(number);
		System.out.println("Factorial of " + number + " is: " + fact);
	}
}
