package com.learning.hackerrank;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class MinSwap2 {

	// Complete the minimumSwaps function below.
	static int minimumSwaps(int[] arr) {
		int lenth = arr.length - 1;
		int minimumSwaps = 0;
		for (int i = 0; i < lenth; i++) {
			if (i < arr[i] - 1) {
				int j = Math.min(lenth, arr[i] - 1);
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				minimumSwaps++;
				i--;
			}
		}
		return minimumSwaps;

	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(
				System.getenv("OUTPUT_PATH")));

		int n = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		int[] arr = new int[n];

		String[] arrItems = scanner.nextLine().split(" ");
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int i = 0; i < n; i++) {
			int arrItem = Integer.parseInt(arrItems[i]);
			arr[i] = arrItem;
		}

		int res = minimumSwaps(arr);

		bufferedWriter.write(String.valueOf(res));
		bufferedWriter.newLine();

		bufferedWriter.close();

		scanner.close();
	}
}
