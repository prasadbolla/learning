package com.learning.hackerrank;

public class CountInverstion {

	static int getInvCount(int[] arr) {
		int inversionsCount = 0;
		int n = arr.length;
		for (int i = 0; i < n - 1; i++) {
			for (int j = i + 1; j < n; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
					inversionsCount++;
				}
			}
		}

		return inversionsCount;
	}

	// Driver method to test the above function
	public static void main(String[] args) {
		int arr[] = new int[] { 2, 1, 3, 1, 2 };
		System.out.println("Number of inversions are " + getInvCount(arr));
	}
}
