package com.learning.hackerrank;

import java.util.Arrays;

public class VeryBigSum {

	// Complete the aVeryBigSum function below.
	static long aVeryBigSum(long[] ar) {

		return Arrays.stream(ar).sum();
	}

	public static void main(String[] args) {

		long[] ar = { 1000000001, 1000000002, 1000000003, 1000000004,
				1000000005 };
		;
		System.out.println(aVeryBigSum(ar));

	}
}
