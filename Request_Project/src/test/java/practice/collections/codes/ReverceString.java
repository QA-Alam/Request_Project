package practice.collections.codes;

import java.util.Arrays;
import java.util.Collections;

import org.testng.annotations.Test;

public class ReverceString {

	public static void main(String[] args) {
		// Fast i have to declare string variable as per require value
		String name = "Haq";
// then help with the string variable i calling  tochararray method which one help me to convert 
		// string to character agile i have to store in to the chat array variable
		// this char variable continue string value

		char[] nm = name.toCharArray();
//then i have to create a loop, there is many kind of loop like for loop,while loop,advance loop, do while loop.
//but i am using now basic 	loop 
// i write the for then parenthesis	open and closed, inside the  parenthesis i am insilize the int variable 
// then help with char variable dot length which one count the value as well as  add the mynass one
//then,i is greater then equal 0 ; i -- operation which help me to reverse my string 		 
		for (int i = (nm.length) - 1; i >= 0; i--) {
//if i need to print out inside the parenthesis i am passing the  char variable plus dimension  inside 
// the dimension i have to pass looping variable name			
			System.out.print(nm[i]);

//finally i get the result
		}

	}
@Test
	public static void mainss() {          
        //Create an array of integers  
            Integer arr[] = {10, 20, 30, 40, 50};   
            System.out.println("Original Array : " +Arrays.toString(arr));         
            Collections.reverse(Arrays.asList(arr));           
            System.out.println("Modified Array : " +Arrays.toString(arr));  
          }  
}  

