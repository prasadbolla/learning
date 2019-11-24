package com.learning.hackerrank;

import java.util.Arrays;

public class MinMax2 {

	// Complete the maxMin function below.
	static int maxMin(int k, int[] arr) {
		int unfairness = Integer.MAX_VALUE;

		Arrays.sort(arr);
		for (int i = 0; i < arr.length - k + 1; i++)
			unfairness = Math.min(arr[i + k - 1] - arr[i], unfairness);

		return unfairness;

	}

	public static void main(String[] args) {

		int[] arr = { 1, 4, 7, 2 };
		int k = 2;
		System.out.println(maxMin(k, arr));

	}
}
