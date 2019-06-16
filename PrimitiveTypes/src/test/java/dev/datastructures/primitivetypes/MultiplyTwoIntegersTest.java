package dev.datastructures.primitivetypes;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class MultiplyTwoIntegersTest {
	
	@Test
	public void test_multiply_two_integers() {
		assertTrue(0 == MultiplyTwoIntegers.multiply(5, 0));
		assertTrue(51 == MultiplyTwoIntegers.multiply(3, 17));
	}

}
