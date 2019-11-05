package com.learning.algorithms;

public class BinarySearch {
	public static void main(String [] a){
		int[] aa = {1,3,5,9,11,12, 13,34,35};
		System.out.println(binarySearch(aa, 55));
	}
public static int binarySearch(int[] a, int x){

	int p=0;
	int r=a.length-1;
	while(p <= r){
		int q = (p+r)/2;
		if(a[q]<x)p=q+1;
		else if(a[q] > x)r=q-1;
		else return q;
		
	}
	return -1;
}
}
