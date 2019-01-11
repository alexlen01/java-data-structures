package com.local.coding.arrays;

/**
 * Write a function to remove specified row(s) from a two-dimensional array of doubles.
 */
public class RemoveRow {

	static double[][] removeRow(double[][] input, int[][] removeRow) {
		// Create a new array reduced by the size of removed row(s)
		double[][] output = new double[input.length - removeRow.length][input[0].length];
	
		for (int i = 0, j = 0, k = 0; i < input.length; i++) {
			if (j < removeRow.length) {
				if (i == removeRow[j][0]) {
					j++;
					continue;
				}
			}
			output[k][0] = input[i][0];
			k++;
		}

		return output;
	}

}
