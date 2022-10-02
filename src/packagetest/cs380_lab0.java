// NAME: Alice Williams
// ID##: 43894035
// PROG: CS 380 Lab 0
// FILE: CS380_lab0.java
// DESC: Reverse a number in Java.
// DATE: September 2, 2022

/**
 * packagetest contains the lab 0 entry point.
 */
package packagetest;

public class CS380_lab0 {

	public static void main(String[] args) {
		
		// start printing
		System.out.println("First Lab CS 380");

		// variables
		int toReverse = 12345;
		int reversed = 0;

		// display variable info to user
		System.out.println("Num to reverse: " + toReverse);

		// reverse the integer
		while (toReverse > 0) {
			reversed *= 10;
			reversed += toReverse % 10;
			toReverse /= 10;
		}

		// display output and finish program
		System.out.println("Num reversed: " + reversed);
		System.out.println("First Lab CS 380 completed!");
	}

}
