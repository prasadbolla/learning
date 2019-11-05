package com.learning.algorithms;

public class LinearSearch {
	public static void main(String[] a) {
		int[] aa = {1,3,5,9,11,12};
		System.out.println(linearSearch(aa, 12));
	}

	public static int linearSearch(int[] a, int x) {
		System.out.println(a.length);
		for (int i = 0; i < a.length; i++) {
			if (a[i] == x) {
				return i;
			}
		}
		return -1;
	}
}
