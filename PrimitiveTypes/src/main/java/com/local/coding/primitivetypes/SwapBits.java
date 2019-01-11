package com.local.coding.primitivetypes;

/**
 * Write a program to swap the bits from a specified binary word.
 */
public class SwapBits {

	/**
	 * The time complexity is O(1), independent of the word size.
	 */
	static long swapBits(long x, int i, int j) {
		// Extract the i and j bits, and see if they differ.
		if (((x >>> i) & 1) != ((x >>> j) & 1)) {
			// i and j bits differ. Swap them by flipping their values.
			// Select the bits to flip with bitMask
			long bitMask = (1L << i) | (1L << j);
			// Since x^1 == 0 when x = 1 and 1 when x = 0, we can perform the flip XOR.
			x ^= bitMask;
		}
		return x;
	}
	

}
