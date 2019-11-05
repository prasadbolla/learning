/**
 * 
 */
package com.learning.algorithms.sort;

/**
 * @author PRASADBolla
 *
 */
public class InsertionSortSecondPractise {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] data = { 3, 2, 4, 1, 5 };
		for (int i = 1; i < data.length; i++) {
			int element = data[i];
			int lastSortedIndex=i -1;
			while(lastSortedIndex>=0 && data[lastSortedIndex]>element){
				data[lastSortedIndex+1]=data[lastSortedIndex];
				lastSortedIndex--;
			}
			data[lastSortedIndex+1]=element;
	}
		for(int i=0; i < data.length; i++){
			System.out.println(data[i]);
		}
	}

}
