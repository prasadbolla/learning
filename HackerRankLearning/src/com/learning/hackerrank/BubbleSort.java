package com.learning.hackerrank;

import java.util.Scanner;

public class BubbleSort {

	// Complete the countSwaps function below.
	static void countSwaps(int[] a) {
		int endPosition = a.length - 1;
		int swapPosition=0;
		int swapCount=0;
		while (endPosition > 0) {
			swapPosition = 0;

			for (int i = 0; i < endPosition; i++) {

				if (a[i] > a[i + 1]) {
					int tmp = a[i];
					a[i] = a[i + 1];
					a[i + 1] = tmp;
					swapCount++;
					swapPosition = i;
				}
			}

			endPosition = swapPosition;
            System.out.println("Array is sorted in "+ swapCount +" swaps.");
            System.out.println("First Element: "+a[0]);
            System.out.println("Last Element: "+a[a.length-1]);
		}
	        
/*		int n = a.length;
		for (int i = 0; i < n - 1; i++)
			for (int j = 0; j < n - i - 1; j++)
				if (a[j] > a[j + 1]) {
					// swap temp and arr[i]
					int temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}*/

	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int n = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		int[] a = new int[n];

		String[] aItems = scanner.nextLine().split(" ");
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int i = 0; i < n; i++) {
			int aItem = Integer.parseInt(aItems[i]);
			a[i] = aItem;
		}

		countSwaps(a);

		scanner.close();
	}
}
