package com.learning.algorithms;

public class RecursionBinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] aa = {1,3,5,9,11,12, 13,34,35};
		System.out.println(recursionBinearSearch(aa,0,aa.length-1, 51));
	}

	public static int recursionBinearSearch(int[] a, int p, int q, int x) {
		if(p > q)
			return -1;
		int middle = (p + q) / 2;
		if (a[middle] > x)
			return recursionBinearSearch(a, p, middle - 1, x);
		else if (a[middle] < x)
			return recursionBinearSearch(a, middle + 1, q, x);
		else if(a[middle] == x) return middle;
		
		return -1;
	}
}
