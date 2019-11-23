package com.learning.hackerrank;

public class PlusMinus {

	// Complete the plusMinus function below.
	static void plusMinus(int[] arr) {
		double positive = 0;
		double negative = 0;
		double zero = 0;
		for (int i = 0; i < arr.length; i++) {
			int value = arr[i];
			positive += value > 0 ? 1 : 0;
			negative += value < 0 ? 1 : 0;
			zero += value == 0 ? 1 : 0;
		}
		System.out.println(positive / arr.length);
		System.out.println(negative / arr.length);
		System.out.println(zero / arr.length);

	}

	public static void main(String[] args) {

		int[] arr = { -4, 3, -9, 0, 4, 1 };
		plusMinus(arr);

	}
}