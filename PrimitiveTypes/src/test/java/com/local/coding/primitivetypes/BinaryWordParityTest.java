package com.local.coding.primitivetypes;

import static org.junit.Assert.*;

import java.math.BigInteger;

import org.junit.Test;

public class BinaryWordParityTest {

	private static String initial = "A fox jumped over a fance";

	@Test
	public void test_parity_is_1() {
		long x = parseLong("1011", 2);
		short s1 = BinaryWordParity.parityBruteForce(x);
		short s2 = BinaryWordParity.parityImproved(x);
		short s3 = BinaryWordParity.parity(x);
		assertTrue("the parity of 1011 is 1", 1 == s1 & s1 == s2 & s2 == s3 & s3 == s1);
	}

	@Test
	public void test_parity_is_0() {
		long x = parseLong("1001000", 2);
		short s1 = BinaryWordParity.parityBruteForce(x);
		short s2 = BinaryWordParity.parityImproved(x);
		short s3 = BinaryWordParity.parity(x);
		assertTrue("the parity of 1001000 is 0", 0 == s1 & s1 == s2 & s2 == s3 & s3 == s1);
	}

	@Test
	public void test_parity_with_8_bit_words() {
		/** Compute the parity of 8-bit words **/
		String[] words = toBinary(initial).split(" ");
		for (String s : words) {
			long x = parseLong(s, 2);
			short s1 = BinaryWordParity.parityBruteForce(x);
			short s2 = BinaryWordParity.parityImproved(x);
			short s3 = BinaryWordParity.parity(x);
			assertTrue("the parity of " + s + " is " + s1, s1 == s2 & s2 == s3 & s3 == s1);
		}
	}

	@Test
	public void test_parity_with_binary_64bit_words() {
		/** Compute the parity of 64-bit words **/
		String[] words = toBinary(initial, 64).split(" ");
		for (String s : words) {
			long x = parseLong(s, 2);
			short s1 = BinaryWordParity.parityBruteForce(x);
			short s2 = BinaryWordParity.parityImproved(x);
			short s3 = BinaryWordParity.parity(x);
			assertTrue("the parity of " + s + " is " + s1, s1 == s2 & s2 == s3 & s3 == s1);
		}
	}

	/**
	 * The usual way is to use String#getBytes() to get the underlying bytes and
	 * then present those bytes in some other form (hex, binary whatever).
	 */
	private static String toBinary(String s) {
		StringBuilder buf = new StringBuilder();
		byte[] bytes = s.getBytes();
		for (byte b : bytes) {
			int val = b;
			for (int i = 0; i < 8; i++) {
				buf.append((val & 128) == 0 ? 0 : 1); 
				val <<= 1;
			}
			buf.append(' '); // separator
		}
		return buf.toString();
	}

	private static String toBinary(String str, int bits) {
		StringBuilder buf = new StringBuilder();
		char[] chars = str.toCharArray();
		for (char c : chars) {
			String binary = Integer.toBinaryString(c);
			int length = binary.length();
			if (length != bits) {
				length = bits - length;
				if (length == bits) {
					buf.append(binary);
				} else if (length > 0) {
					for (int j = 0; j < length; j++) {
						buf.append('0');
					}
					buf.append(binary);
				}
			} else {
				buf.append(binary);
			}
			buf.append(' '); // separator
		}
		return buf.toString();
	}

	private static long parseLong(String s, int base) {
		return new BigInteger(s, base).longValue();
	}

}
