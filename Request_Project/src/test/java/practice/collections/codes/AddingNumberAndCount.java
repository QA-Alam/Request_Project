package practice.collections.codes;


public class AddingNumberAndCount {

	// How to a
	//Get the number
	//Declare a variable to store the sum and set it to 0
	//Repeat the next two steps till the number is not 0
	//Get the rightmost digit of the number with help of the remainder ‘%’ operator by dividing it by 10 and add it to sum.
	//Divide the number by 10 with help of ‘/’ operator to remove the rightmost digit.
	//Print or return the sum
	
	public static void main(String[] args) {
		
		//int n = 687;
		//System.out.println(getSum(n));
	
		int num = 123;
		int sum = 0;
		while (num > 0) {                                 // num after dividing by 10= 12.3
			sum = sum + num % 10;     // 123 % 10 = 3    remainder is 3
			                                                          // num after dividing by 10 is 1.2
			num = num / 10;                  // 12 % 10 = 2 remainder is 2 
		} 
		System.out.println(sum);
	}

	/* Function to get sum of digits */
	static int getSum(int n) {
		int sum = 0;
		while (n != 0) {
			sum = sum + n % 10;
			n = n / 10;
		}
		return sum;
	}

	// Driver code
	public static void mains(String[] args) {
		int n = 687;
		System.out.println(getSum(n));
	}
}

// This code is contributed by Gitanjali
