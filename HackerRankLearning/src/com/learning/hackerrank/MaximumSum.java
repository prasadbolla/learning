package com.learning.hackerrank;

public class MaximumSum {

	// Complete the maxSubsetSum function below.
	static int maxSubsetSum(int[] arr) {
		int include = arr[0];
		int exclude = 0;
		int temp;

		for (int i = 1; i < arr.length; i++) {
			// max excluding
			temp = (include > exclude) ? include : exclude;

			// max including
			include = exclude + arr[i];
			exclude = temp;
		}

		return ((include > exclude) ? include : exclude);
	}

	public static void main(String[] args) {

		int[] arr = { 3, 7, 4, 6, 5 };
		System.out.println(maxSubsetSum(arr));

	}
}
