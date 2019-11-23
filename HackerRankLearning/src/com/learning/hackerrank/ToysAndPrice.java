package com.learning.hackerrank;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

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

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {

		int[] prices = { 1, 2, 3, 4 };
		int k = 7;
		int result = maximumToys(prices, k);
		System.out.println(result);
	}
}
