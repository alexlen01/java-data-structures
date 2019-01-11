package com.local.coding.strings;

/**
 * Write the different ways to reverse a string
 */
public class ReverseString {
	
	static String reverseWithStringBuilder(String s) {
		return new StringBuilder(s).reverse().toString();
	}
	
	static String reverseWithBruteForce(String s) {
		StringBuilder sb = new StringBuilder();
		char[] charArray = s.toCharArray();
		for (int i = charArray.length - 1; i >= 0; i--) {
			sb.append(charArray[i]);
		}
		return sb.toString();		
	}

	static String reverseWithRecursion(String s) {
		if (s.toString().length() == 0) {
			return "";
		}
		return s.charAt(s.length() - 1) + reverseWithRecursion(s.substring(0, s.length() - 1));
	}

	static String reverseWithStream(String str) {
		return str.chars()
				.mapToObj(c -> (char) c)
				.reduce("", (s, c) -> c + s, (s1, s2) -> s2 + s1);
	}

}
