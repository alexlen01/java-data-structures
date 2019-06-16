package dev.datastructures.primitivetypes;

import org.junit.Test;

import java.nio.charset.Charset;

import static org.junit.Assert.assertTrue;

public class IntegerWithSameWeightTest {

	@Test
	public void test_closestToWeightZero() {
		try {
			IntegerWithSameWeight.closestToWeight(0);
		} catch (IllegalArgumentException e) {
			assertTrue("all bits are 0 or 1".equals(e.getMessage()));
		}
	}
	
	@Test
	public void test_closestToWeightAllOnes() {
		try {
			IntegerWithSameWeight.closestToWeight(111111111111L);
		} catch (IllegalArgumentException e) {
			assertTrue("all bits are 0 or 1".equals(e.getMessage()));
		}
	}

	@Test
	public void test_closestToWeightValid() {
		assertTrue(125 == IntegerWithSameWeight.closestToWeight(123));
	}

	@Test
	public void test_closestToWeightBitWord() {
		Charset UTF_8 = Charset.forName("UTF-8");
		String initial = "IntegerWithSameWeight";
		byte[] bytes = initial.getBytes(UTF_8);
		System.out.println(initial + ':');
		for (byte b : bytes) {
			System.out.printf("%3s --> %3s", String.valueOf(b), IntegerWithSameWeight.closestToWeight((long) b));
			System.out.println();
		}		
	}
}
