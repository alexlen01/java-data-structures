package dev.datastructures.primitivetypes;

import org.junit.Test;

import java.math.BigInteger;
import java.nio.charset.Charset;
import java.util.Arrays;

public class SwapBitsTest {

	private static final Charset UTF_8 = Charset.forName("UTF-8");
	
	private static String initial = "Hello World!";

	private static final int STARTING_BIT = 1;
	private static final int ENDING_BIT = 5;

	@Test
	public void testSwapBits() {
		byte[] bytes = initial.getBytes(UTF_8);
		System.out.println("text= " + initial);
		System.out.println("bytes= " + Arrays.toString(bytes));

		/** Compute the parity of 8-bit words **/
		String[] words = toBinary(initial).split(" ");
		
		for (int i = 0; i < words.length; i++) {
			long x = parseLong(words[i], 2);
			long y = SwapBits.swapBits(x, STARTING_BIT, ENDING_BIT);
			bytes[i] = (byte) y;
		}

		System.out.println("bytes swapped= " + Arrays.toString(bytes));
		System.out.println("text swapped= " + new String(bytes, UTF_8));
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

	private static long parseLong(String s, int base) {
		return new BigInteger(s, base).longValue();
	}

}
