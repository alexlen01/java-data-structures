package dev.datastructures.strings;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ReverseStringTest {

	private static String initial = "A fox jumped over a fance";
	private static String reversed = "ecnaf a revo depmuj xof A";

	@Test
	public void testReversed() {
		assertEquals(reversed, ReverseString.reverseWithBruteForce(initial)); 
		assertEquals(reversed, ReverseString.reverseWithStringBuilder(initial));
		assertEquals(reversed, ReverseString.reverseWithBruteForce(initial));
		assertEquals(reversed, ReverseString.reverseWithStream(initial));
	}

}
