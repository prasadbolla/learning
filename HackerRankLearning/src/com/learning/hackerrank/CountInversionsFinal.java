package com.learning.hackerrank;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class CountInversionsFinal {

	// Complete the countInversions function below.
	static long countInversions(int[] arr) {
		int length = arr.length;
		if (length <= 1) {
			return 0;
		}

		int mid = length >> 1;
		int[] left = Arrays.copyOfRange(arr, 0, mid);
		int[] right = Arrays.copyOfRange(arr, mid, arr.length);
		long countOfInversions = countInversions(left) + countInversions(right);

		int range = length - mid;
		int iLeft = 0;
		int iRight = 0;
		for (int i = 0; i < length; i++) {
			if (iLeft < mid
					&& (iRight >= range || left[iLeft] <= right[iRight])) {
				arr[i] = left[iLeft++];
				countOfInversions += iRight;
			} else if (iRight < range) {
				arr[i] = right[iRight++];
			}
		}

		return countOfInversions;
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(
				System.getenv("OUTPUT_PATH")));

		int t = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int tItr = 0; tItr < t; tItr++) {
			int n = scanner.nextInt();
			scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

			int[] arr = new int[n];

			String[] arrItems = scanner.nextLine().split(" ");
			scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

			for (int i = 0; i < n; i++) {
				int arrItem = Integer.parseInt(arrItems[i]);
				arr[i] = arrItem;
			}

			long result = countInversions(arr);

			bufferedWriter.write(String.valueOf(result));
			bufferedWriter.newLine();
		}

		bufferedWriter.close();

		scanner.close();
	}
}
