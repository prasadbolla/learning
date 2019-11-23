package com.learning.hackerrank;

import java.io.IOException;
import java.util.Arrays;

public class MinimumAbsoluteDifferenceInArray {

	// Complete the minimumAbsoluteDifference function below.
	static int minimumAbsoluteDifference(int[] arr) {

		Arrays.sort(arr);
		int min = Integer.MAX_VALUE;
		for (int i = 1; i < arr.length; i++) {
			min = Math.min(min, Math.abs(arr[i] - arr[i - 1]));
		}
		return min;

	}

	public static void main(String[] args) throws IOException {

		int[] arr = { 1, -3, 71, 68, 17 };
		int result = minimumAbsoluteDifference(arr);

	}
}
