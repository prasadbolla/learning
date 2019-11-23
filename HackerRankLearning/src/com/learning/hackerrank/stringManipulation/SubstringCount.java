package com.learning.hackerrank.stringManipulation;

import java.io.IOException;

public class SubstringCount {

	// Complete the substrCount function below.
	static long substrCount(int n, String s) {
		long result = 0;

		for (int i = 0; i < n; i++) {
			result++;
			int leftCount = 1;
			int rightCount = 0;
			char lastChar = s.charAt(i);
			boolean midPoint = false;

			for (int j = i + 1; j < n; j++) {
				char ch = s.charAt(j);
				if (!midPoint && ch != lastChar) {
					midPoint = true;
				} else if (midPoint && (ch != lastChar || j == n - 1)) {
					if (j == n - 1 && ch == lastChar) {
						rightCount++;
					}

					if (leftCount == rightCount) {
						result++;
					}

					break;
				} else if (!midPoint && ch == lastChar) {
					leftCount++;
					if (leftCount >= 2) {
						result++;
					}
				} else if (midPoint && ch == lastChar) {
					rightCount++;
					if (leftCount == rightCount) {
						result++;
						break;
					}
				}
			}
		}

		return result;
	}

	public static void main(String[] args) throws IOException {

		int n = 5;
		String s = "asasd";
		System.out.println(substrCount(n, s));

	}
}