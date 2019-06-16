package dev.datastructures.primitivetypes;

/**
 * WRITE A PROGRAM TO REVERSE THE DIGITS IN A NUMERIC INTEGER
 */
public class ReverseDigits {

	/**
	 * A brute-force solution is to convert integer to a String and to use
	 * a reverse() method (@see java.util.StringBuilder#reverse())
	 */
	static int reverse(int x) {
		boolean isNegative = x < 0;
		int result = 0;
		int remaining = Math.abs(x);
		while (remaining != 0) {
			result = result * 10 + remaining %10;
			remaining = remaining / 10;
		}
		return (isNegative ? -result : result);
	}

}
