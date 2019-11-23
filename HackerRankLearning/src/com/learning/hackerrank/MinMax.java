package com.learning.hackerrank;

public class MinMax {

	// Complete the miniMaxtotal function below.
	static void miniMaxtotal(int[] arr) {
		long minValue = Long.MAX_VALUE;
		long maxValue = 0;
		long total = 0;
		for (int i = 0; i < arr.length; i++) {
			long value = arr[i];
			if (maxValue < value) {
				maxValue = value;
			}
			if (minValue > value) {
				minValue = value;
			}

			total += value;
		}

		System.out.println((total - maxValue) + " " + (total - minValue));

		/*
		 * Arrays.sort(arr); long total = Arrays.stream(arr).total();
		 * System.out.println((total - arr[arr.length-1]) + " " + (total -
		 * arr[0]));
		 */
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };

		miniMaxtotal(arr);

	}
}