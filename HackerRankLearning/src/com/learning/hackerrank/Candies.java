package com.learning.hackerrank;

import java.util.Arrays;

public class Candies {

	// Complete the candies function below.
	static long candies(int n, int[] arr) {

		int[] candies = new int[arr.length];
		candies[0] = 1;

		for (int i = 1; i < arr.length; i++) {
			if (arr[i - 1] < arr[i])
				candies[i] = candies[i - 1] + 1;

			if (arr[i - 1] >= arr[i])
				candies[i] = 1;

		}

		for (int i = arr.length - 2; i >= 0; i--) {
			if (arr[i] > arr[i + 1]) {
				if (candies[i] <= candies[i + 1])
					candies[i] = candies[i + 1] + 1;
			}
		}

		return Arrays.stream(candies).sum();
	}

	public static void main(String[] args) {

		int[] arr = { 2, 4, 2, 6, 1, 7, 8, 9, 2, 1 };
		int n = 10;
		System.out.println(candies(n, arr));

	}
}
