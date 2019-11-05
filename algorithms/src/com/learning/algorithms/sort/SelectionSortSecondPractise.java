/**
 * 
 */
package com.learning.algorithms.sort;

/**
 * @author PRASADBolla
 *
 */
public class SelectionSortSecondPractise {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	 int[] data = {1, 4, 2, 6, 3};
	 
	 
	 for(int i= 0; i < data.length; i++){
		 int mininum=i;
		 for(int j=i+1; j < data.length; j++){
			 if(data[j] < data[mininum]){
				 mininum=j;
			 }
		 }
		 int temp = data[i];
		 data[i]=data[mininum];
		 data[mininum]=temp;
	 }
		for(int i=0; i < data.length; i++){
			System.out.println(data[i]);
		}
	}

}
