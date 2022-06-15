package practice.collections.codes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RemoveChar {
	// Java program to remove upper-case, lower-case
	// special, numeric, and non-numeric characters

	// Function to remove upper-case characters
	public static String removingUpperCaseCharacters(String str) {

		// Create a regular expression
		String regex = "[A-Z]";

		// Compile the regex to create pattern
		// using compile() method
		Pattern pattern = Pattern.compile(regex);

		// Get a matcher object from pattern
		Matcher matcher = pattern.matcher(str);

		// Replace every matched pattern with the
		// target string using replaceAll() method
		return matcher.replaceAll("");
	}

	// Function to remove lowercase characters
	public static String removingLowerCaseCharacters(String str) {

		// Create a regular expression
		String regex = "[a-z]";

		// Compile the regex to create pattern
		// using compile() method
		Pattern pattern = Pattern.compile(regex);

		// Get a matcher object from pattern
		Matcher matcher = pattern.matcher(str);

		// Replace every matched pattern with the
		// target string using replaceAll() method
		return matcher.replaceAll("");
	}

	// Function to remove special characters
	public static String removingSpecialCharacters(String str) {

		// Create a regular expression
		String regex = "[^A-Za-z0-9]";

		// Compile the regex to create pattern
		// using compile() method
		Pattern pattern = Pattern.compile(regex);

		// Get a matcher object from pattern
		Matcher matcher = pattern.matcher(str);

		// Replace every matched pattern with the
		// target string using replaceAll() method
		return matcher.replaceAll("");
	}

	// Function to remove numeric characters
	public static String removingNumericCharacters(String str) {

		// Create a regular expression
		String regex = "[0-9]";

		// Compile the regex to create pattern
		// using compile() method
		Pattern pattern = Pattern.compile(regex);

		// Get a matcher object from pattern
		Matcher matcher = pattern.matcher(str);

		// Replace every matched pattern with the
		// target string using replaceAll() method
		return matcher.replaceAll("");
	}

	// Function to remove non-numeric characters
	public static String removingNonNumericCharacters(String str) {

		// Create a regular expression
		String regex = "[^0-9]";

		// Compile the regex to create pattern
		// using compile() method
		Pattern pattern = Pattern.compile(regex);

		// Get a matcher object from pattern
		Matcher matcher = pattern.matcher(str);

		// Replace every matched pattern with the
		// target string using replaceAll() method
		return matcher.replaceAll("");
	}
	public static void main(String[] args) {
		System.out.println(removingUpperCaseCharacters("MohammedAlam"));
	}
}
