package com.learning.algorithms;

public class RecursionLinearSearch {

	public static void main(String[] args) {
		//reduceByOne(10);
		System.out.println(recursiveLinearSearch(new int[]{1,3,5,8,12,63},0, 12));

	}

	public static void reduceByOne(int n) {
		if(n !=0)
		reduceByOne(n - 1);
		System.out.println(n);
	}
	public static int recursiveLinearSearch(int[] a, int i, int x){
		if(i > a.length-1) return -1;
		else if(a[i] == x) return i;
		else
		return recursiveLinearSearch(a, i+1, x);
		
	}
}
