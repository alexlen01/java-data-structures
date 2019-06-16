package dev.datastructures.primitivetypes;

/**
 * COMPUTING THE PARITY OF A WORD
 * 
 * The parity of a binary word is 1 if the number of 1s in the word is odd;
 * otherwise, it is 0. For example, the parity of 1011 is 1, and the parity of
 * 10001000 is 0. Parity checks are used to detect single bit errors in data
 * storage and communication.
 */
public class BinaryWordParity {

	/**
	 * The brute-force algorithm iteratively tests the value of each
	 * bit while tracking the number of 1s seen so far.
	 * 
	 * The time complexity is O(n), where n is the word size.
	 */
	static short parityBruteForce(long x) {
		short result = 0;
		while (x != 0) {
			result ^= (x & 1);
			x >>= 1;
		}
		return result;
	}

	/**
	 * Improved: erasing the lowest set bit in a word in a single operation.
	 */
	static short parityImproved(long x) {
		short result = 0;
		while (x != 0) {
			result ^= 1;
			x &= (x - 1); // Drops the lowest set bit of x
		}
		return result;
	}

	/**
	 * Optimized: The XOR of two bits is 0 if both bits are 0 or both bits are
	 * 1; otherwise it is 1. The XOR of a group of bits is its parity. We can
	 * exploit this fact to use the CPU's word-level XOR instruction to process
	 * multiple bits at a time.
	 */
	static short parity(long x) {
		x ^= x >>> 32;
		x ^= x >>> 16;
		x ^= x >>> 8;
		x ^= x >>> 4;
		x ^= x >>> 2;
		x ^= x >>> 1;
		return (short) (x & 0x1);
	}	
	
}
