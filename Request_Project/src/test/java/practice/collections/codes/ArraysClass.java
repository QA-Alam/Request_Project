package practice.collections.codes;

import org.testng.annotations.Test;

public class ArraysClass {


	       
	  public static void main(String[] args) {
			//declaring and initializing 2D array  
			int arr[][]={{1,2,3,4}, 
					     {2,4,0,6},
					     {4,4,5,8}};  
			// First count the value as row
			// Second count as column 
			int x = arr[1][2];
			System.out.println(x); // Outputs 0
			
			
			//printing 2D array  
			for(int i=0;i<3;i++){  
			 for(int j=0;j<3;j++){  
			   System.out.print(arr[i][j]+" ");  
			 }  
			System.out.println();  
			}  
			
		  
		  
		  // How to declare single dimensional array 
		  // Array length is fixed
		  // Array is faster 
	/*		String a[]= new String[1000];
			a[0] = "Alam";
			a[1] = "sazzad";
			a[2] = "Mir";
			a[3] = "Asif";
			a[4] = "Rehan";
			a[5] = "Rehan";
			for (int i =0; i<a.length; i++) {	
				System.out.println(a[i]);
			}
			
			System.out.println(a[1]); */
			
			
/*			// This is the old way (single dimensional)
			int num[]= new int[5];
			num[0] = 100;
			num[1] = 200;
			num[2] = 300;
			num[3] = 400;
			num[4] = 500;
			
			//System.out.println(Arrays.asList(num));
			
			// This is the new way (single dimensional)
			int []numbers = {100, 200, 300, 400, 500};
			                  
			                   
			 // How to declare multidimensional array 		
			String[][] arr = {{"Sazzad", "Alam", "Mir","Asif", "Rehan"},
			                  {"smart", "tech", "fahima","rokeya", "sarmin"},
			                  {"Oni", "Ani", "Hassan","Rahaman", "All students"}} ;  
*/
	  }
	  
	  @Test
			 public void mainName () {
		         //2-d array initialised with values    
		        int[][] intArray = { { 1, 2 }, { 3, 4 },{5,6}}; 
		        //print the array
		        System.out.println("Initialized Two dimensional array:");
		        for (int i = 0; i < 3; i++) { 
		            for (int j = 0; j < 2; j++) { 
		            System.out.print(intArray [i][j] + " "); 
		            } 
		 
		            System.out.println(); 
		        } 
		    }
		
}
