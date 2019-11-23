package com.learning.hackerrank;

import java.io.IOException;
import java.util.Arrays;

public class ToysAndPrice {

	// Complete the maximumToys function below.
	static int maximumToys(int[] prices, int k) {
		int result = 0;
		int totalPrice = 0;
		Arrays.sort(prices);
		for (int i = 0; i < prices.length; i++) {
			int tempPrice = totalPrice + prices[i];
			if (tempPrice <= k) {
				totalPrice = totalPrice + prices[i];
				result++;
			}

		}

		return result;
	}


	public static void main(String[] args) throws IOException {

		int[] prices = { 1, 2, 3, 4 };
		int k = 7;
		int result = maximumToys(prices, k);
		System.out.println(result);
	}
}
