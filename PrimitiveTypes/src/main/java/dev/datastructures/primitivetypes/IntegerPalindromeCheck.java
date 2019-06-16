package dev.datastructures.primitivetypes;

/**
 * CHECK IF A DECIMAL INTEGER IS A PALINDROME
 * 
 * A palindrome string is one which reads the same forwards and backwards.
 * 
 * Write a program which determines if the decimal representation of an integer
 * is a palindrome string. For example, a program should return true for the
 * inputs 0,1,7,11,121,333, and 2147447412, and false for the inputs -1, 12,
 * 100, and 2147483647.
 */
public class IntegerPalindromeCheck {

	static boolean isPalindrome(int x) {
		if (x < 0) {
			return false;
		} else if (x == 0) {
			return true;
		}
		return false;
	}
}
