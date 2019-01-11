package com.local.coding.primitivetypes;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class ReverseDigitsTest {
	
	@Test
	public void test_reverseDigits() {
		assertTrue(-1 == ReverseDigits.reverse(-100));
		assertTrue(213 == ReverseDigits.reverse(312));
		assertTrue(599 == ReverseDigits.reverse(995));
	}

}
