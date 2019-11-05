/**
 * 
 */
package com.learning.algorithms.missingnumber;


/**
 * @author PRASADBolla
 *
 */
public class MissingNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(missingNumber(new int []{1,2,4,5,6}));
	}
	public static int missingNumber(int[] nums){
		int sum=0;
		for(int i: nums){
			sum += i;
		}
		int n = nums.length + 1;
		return (n * (n-1) / 2) - sum;
		
	}
}
