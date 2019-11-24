package com.learning.hackerrank;

import java.util.Arrays;

public class MinimumCost {

	// Complete the getMinimumCost function below.
	static int getMinimumCost(int k, int[] c) {
		Arrays.sort(c);
		int minimumCost = 0;
		int customer = 0;
		int lastPurchase = 0;
		for (int i = c.length - 1; i >= 0; i--) {
			minimumCost += c[i] * (lastPurchase + 1);

			customer++;
			if (customer == k) {
				customer = 0;
				lastPurchase++;
			}
		}
		return minimumCost;
	}

	public static void main(String[] args) {

		int k = 3;
		int[] c = { 1, 3, 5, 7, 9 };
		System.out.println(getMinimumCost(k, c));

	}
}
