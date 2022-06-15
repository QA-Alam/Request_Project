package practice.collections.codes;

// An enum type is a special data type that enables for a variable to be a set of predefined constants. 
// The variable must be equal to one of the values that have been predefined for it. 
// Common examples include compass directions (values of NORTH, SOUTH, EAST, and WEST) and the days of the week.

// What is the purpose of enum in Java?
// The main objective of enum is to define our own data types(Enumerated Data Types). 
// Declaration of enum in Java: Enum declaration can be done outside a 
// Class or inside a Class but not inside a Method.

//A simple enum example where enum is declared
//outside any class (Note enum keyword instead of
//class keyword)

enum Color {
	RED, GREEN, BLUE;
}

public class EnumClass {
	// Driver method
	public static void main(String[] args) {
		Color c1 = Color.RED;
		System.out.println(c1);
	}
}

// Difference between Enums and Classes
// An enum can, just like a class, have attributes and methods. 
// The only difference is that enum constants are public, static and final (unchangeable - cannot be overridden).

// An enum cannot be used to create objects, and it cannot extend other classes (but it can implement interfaces).

// Why And When To Use Enums?
// Use enums when you have values that you know aren't going to change,
// like month days, days, colors, deck of cards, etc.
