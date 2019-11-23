package com.learning.hackerrank;

import java.util.Arrays;


public class Candies {

	// Complete the candies function below.
	static long candies(int n, int[] arr) {
		int result = 0;

		int[] left = new int[n];
		int[] right = new int[n];

		Arrays.fill(left, 1);
		Arrays.fill(right, 1);

		// Left to Right
		for (int i = 1; i < n; i++) {
			if (arr[i - 1] < arr[i]) {
				left[i] = left[i - 1] + 1;
			}
		}

		// Right to Left
		for (int i = n - 2; i >= 0; i--) {
			if (arr[i + 1] < arr[i]) {
				right[i] = right[i + 1] + 1;
			}
		}

		for (int i = 0; i < n; i++) {
			result += Math.max(left[i], right[i]);
		}
		return result;
		
/*		if (arr == null || n == 0) {
			return 0;
		}
		
		int[] candies = new int[n];
		candies[0] = 1;
		for (int i = 1; i < n; i++) {
			candies[i] = 1;
			if (arr[i] > arr[i - 1]) {
				candies[i] += candies[i - 1];
			} else {
				for (int j = i; j > 0 && arr[j] < arr[j - 1]
						&& candies[j] == candies[j - 1]; candies[--j] += 1) {
				}
			}
		}
		return Arrays.stream(candies).sum();*/
	}

	public static void main(String[] args) {

		int[] arr = { 2, 4, 2, 6, 1, 7, 8, 9, 2, 1 };
		int n = 10;
		System.out.println(candies(n, arr));

	}
}
