package com.learning.hackerrank;

import java.io.IOException;

public class SumArray {

	/*
	 * Complete the simpleArraySum function below.
	 */
	static int simpleArraySum(int[] ar) {
		int sum = 0; // initialize sum
		for (int i = 0; i < ar.length; i++)
			sum += ar[i];

		return sum;
	}


	public static void main(String[] args) throws IOException {

		int[] ar={1,2,4,5};
		System.out.println(simpleArraySum(ar));

	}
}
