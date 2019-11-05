package com.learning.algorithms.sort;

public class InsertionSort {

	public static void main(String[] args) {
		int[] a = { 1, 3, 2, 8, 4, 7, 9, 5 };
		for (int i = 1; i < a.length; i++) {
			int element = a[i];
			int j = i - 1;
			while (j >= 0 && a[j] > element) {
				a[j + 1] = a[j];
				j--;
			}
			a[j + 1] = element;
		}
		for(int i=0; i < a.length; i++){
			System.out.println(a[i]);
		}
	}

}
