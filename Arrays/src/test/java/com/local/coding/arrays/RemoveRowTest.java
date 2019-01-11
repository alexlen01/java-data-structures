package com.local.coding.arrays;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Test;

public class RemoveRowTest {

	@Test
	public void testRemoveRow() {

		double[][] test = { { 100 }, { 200 }, { 300 }, { 400 }, { 500 }, { 600 }, { 700 }, { 800 }, { 900 }, { 1000 } };

		int[][] removeRow = { { 0 }, { 1 }, { 3 }, { 4 }, };

		double[][] newTest = RemoveRow.removeRow(test, removeRow);

		assertEquals("[[300.0], [600.0], [700.0], [800.0], [900.0], [1000.0]]", Arrays.deepToString(newTest));
	}

	
}
