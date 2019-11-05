package com.learning.algorithms.sort;

public class SelectionSort {

	public static void main(String[] args) {
		int [] myArray=selectionSort(new int[]{1,5, 3,2,9,6,7});
		for(int i=0; i < myArray.length; i++){
			System.out.println(myArray[i]);
		}
	}
	public static int[] selectionSort(int a[]){
		for(int i=0; i < a.length; i++){
			int minmum = i;
			for(int j =i+1; j < a.length; j++){
				if(a[j]< a[minmum]){
					minmum=j;
				}
			}
			int temp = a[i];
			a[i]=a[minmum];
			a[minmum]=temp;
		}
		return a;
	}
}
