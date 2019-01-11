package com.local.coding.primitivetypes;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class MultiplyTwoIntegersTest {
	
	@Test
	public void test_multiply_two_integers() {
		assertTrue(0 == MultiplyTwoIntegers.multiply(5, 0));
		assertTrue(51 == MultiplyTwoIntegers.multiply(3, 17));
	}

}
