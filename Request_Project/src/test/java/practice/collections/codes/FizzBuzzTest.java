package practice.collections.codes;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzzTest {

	public static List<String> fizzBuzz(int n) {
		List<String> res = new ArrayList<>();
		for (int i = 1; i <= n; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				res.add("FizzBuzz");
			} else if (i % 3 == 0) {
				res.add("Fizz");
			} else if (i % 5 == 0) {
				res.add("Buzz");
			} else {
				res.add(String.valueOf(i));
			}
		}
		return res;
	}
	public static void main(String[] args) {
		System.out.println(fizzBuzzs(15));
	}
	
	public static String fizzBuzzs(int number) {
		if (number % 3 == 0) {
			if (number % 5 == 0) {
				return "fizzbuzz"; 
				} else { 
					return "fizz"; } 
			} else if (number % 5 == 0) {
				return "buzz"; 
				} return String.valueOf(number); }


}
