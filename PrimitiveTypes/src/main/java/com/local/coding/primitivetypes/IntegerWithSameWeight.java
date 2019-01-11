package com.local.coding.primitivetypes;

/**
 * FIND A CLOSEST INTEGER WITH THE SAME WEIGHT
 * 
 * The count of ones in binary representation of integer number is called the
 * weight of that number. The following algorithm finds the closest integer with
 * the same weight. For example, for 123 (0111 1011)₂, the closest integer
 * number is 125 (0111 1101)₂.
 * 
 * The solution for O(n) where n is the width of the input number is by swapping
 * the positions of the first pair of consecutive bits that differ.
 */
public class IntegerWithSameWeight {

	/**
	 * The approach is to swap the two rightmost consecutive bits that differ.
	 */
	static long closestToWeight(long x) {

		// Swap the two rightmost consecutive bits that are different
		for (int i = 0; i < 64; i++) {
			if ((((x >> i) & 1) ^ ((x >> (i + 1)) & 1)) == 1) {
				// then swap them or flip their bits
				int mask = (1 << i) | (1 << i + 1);
				x = x ^ mask;
				return x;
			}
		}

		// Throw error if all bits of x are 0 or 1
		throw new IllegalArgumentException("all bits are 0 or 1");
	}

}
