package dev.datastructures.primitivetypes;

import org.junit.Test;

import java.nio.charset.Charset;

import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

public class ReverseBitsTest {

	private static final Charset UTF_8 = Charset.forName("UTF-8");

	private static String initial = "0123456789";
	
	@Test
	public void test_reverseBit_8() {
		byte[] bytes = initial.getBytes(UTF_8);
		assertTrue(bytes.length != 0);
		System.out.println("Reverse bits of an 8-bit unsigned integer:\n");
		for (int i = 0; i < bytes.length; i++) {
			long number = bytes[i];
			assertNotEquals(number, 0l);
			long reversed = ReverseBits.reverse(number, ReverseBits.DataType.BYTE);
			assertNotEquals(reversed, 0l);
			String binary_initial = Long.toBinaryString(number);
			String formatted_initial = String.format("%8s", binary_initial).replace(' ', '0');
			assertTrue(formatted_initial.length() == 8);
			String binary_reversed = Long.toBinaryString(reversed);
			String formatted_reversed = String.format("%8s", binary_reversed).replace(' ', '0');
			assertTrue(formatted_reversed.length() == 8);
			System.out.printf("%s --> %3s (%s --> %s)\n", Long.toString(number), Long.toString(reversed), formatted_initial, formatted_reversed);
		}
		System.out.println('\n');
	}

	@Test
	public void test_reverseBit_32() {
		byte[] bytes = initial.getBytes(UTF_8);
		assertTrue(bytes.length != 0);
		System.out.println("Reverse bits of an 32-bit unsigned integer:\n");
		for (int i = 0; i < bytes.length; i++) {
			long number = bytes[i];
			assertNotEquals(number, 0l);
			long reversed = ReverseBits.reverse(number, ReverseBits.DataType.INTEGER);
			assertNotEquals(reversed, 0l);
			String binary_initial = Long.toBinaryString(number);
			String formatted_initial = String.format("%32s", binary_initial).replace(' ', '0');
			assertTrue(formatted_initial.length() == 32);
			String binary_reversed = Long.toBinaryString(reversed);
			String formatted_reversed = String.format("%32s", binary_reversed).replace(' ', '0');
			assertTrue(formatted_reversed.length() == 32);
			System.out.printf("%s --> %10s (%s --> %s)\n", Long.toString(number), Long.toString(reversed), formatted_initial, formatted_reversed);
		}
		System.out.println('\n');
	}

}
