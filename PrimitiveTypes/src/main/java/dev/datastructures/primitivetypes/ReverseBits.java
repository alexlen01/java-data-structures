package dev.datastructures.primitivetypes;

import java.util.EnumSet;

/**
 * WRITE A PROGRAM TO REVERSE BITS OF UNSIGNED (8,16,32,64) BIT INTEGER
 */
public class ReverseBits {

	enum DataType {
		BYTE, CHAR, INTEGER, LONG;

		static final EnumSet<DataType> ALL_OPTS = EnumSet.allOf(DataType.class);
	}

	static long reverse(long x, DataType type) {
		long result = 0;
		int i;
		switch (type) {
		case BYTE:
			i = 7;
			break;
		case CHAR:
			i = 15;
			break;
		case INTEGER:
		default:
			i = 31;
			break;
		case LONG:
			i = 63;
			break;
		}
		while (x > 0) {
			result += (x % 2) * Math.pow(2, i);
			i--;
			x = x / 2;
		}
		return result;
	}

}
