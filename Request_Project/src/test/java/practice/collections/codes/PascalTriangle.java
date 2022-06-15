package practice.collections.codes;

/*JAVA PROGRAM TO GENERATE PASCAL TRIANGLE IN 1D ARRAY */
// Algorithm
// Take a number of rows to be printed, n.
// Make outer iteration I for n times to print rows.
// Make inner iteration for J to (N - 1).
// Print single blank space " ".
// Close inner loop.
// Make inner iteration for J to I.
// Print nCr of I and J.
// Close inner loop.
// Print NEWLINE character after each inner iteration.

public class PascalTriangle {
	
	  static int factorial(int n) {
	      int f;
	      for(f = 1; n > 1; n--){
	         f *= n;
	      }
	      return f;
	   }
	   static int ncr(int n,int r) {
	      return factorial(n) / ( factorial(n-r) * factorial(r) );
	   }
	   
	   public static void main(String args[]){
	      System.out.println();
	      int n, i, j;
	      n = 5;

	      for(i = 0; i <= n; i++) {
	         for(j = 0; j <= n-i; j++){
	            System.out.print(" ");
	         }
	         for(j = 0; j <= i; j++){
	            System.out.print(" "+ncr(i, j));
	         }
	         System.out.println();
	      }
	   }
	}