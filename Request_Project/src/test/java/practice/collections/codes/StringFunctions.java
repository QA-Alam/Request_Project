package practice.collections.codes;

import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.Test;

public class StringFunctions {

	// print out a2b3a3
	public static void main(String... args) {
		getCountChar();
		String s = "aabbaaa";
		for (int i = 0; i < s.length() - 1; i++) {
			int count = 1;
			while (i < s.length() - 1 && s.charAt(i) == s.charAt(i + 1)) {
				count++;
				i++;
			}
			System.out.print(s.charAt(i));
			System.out.print(count);
		}

	}

	// Count how many char in the string
	public static void getCountChar() {
		String str = "aabbaaa";
		int i, j;
		char[] ch = str.toCharArray();
		int len = ch.length;
		for (i = 0; i < len; i++) {

			int counter = 0;
			char c = str.charAt(i);
			for (j = 0; j < len; j++) {
				if (c == ch[j]) {
					counter++;
					ch[j] = '\u0000';
				}
			}
			if (counter > 0)
				System.out.println(c + "=" + counter);

		}
	}

	@Test
	public void countDuplicateString() {
		String str = "smarttechitsulition";
		Map<Character, Integer> charMap = new HashMap<Character, Integer>();
		char[] arr = str.toCharArray();
		for (char value : arr) {
			if (Character.isAlphabetic(value)) {
				if (charMap.containsKey(value)) {
					charMap.put(value, charMap.get(value) + 1);
				} else {
					charMap.put(value, 1);
				}
			}
		}
		System.out.println(charMap);
	}

	// How to print recursion number
	public static void maind(String[] args) {
		countDown(5);

	}

	// How to print recursion number
	public static void countDown(int number) {
		if (number == 0) {
			System.out.println(number);
		} else {
			System.out.println(number);
			countDown(number - 1);
		}
	}

}