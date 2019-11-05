/**
 * 
 */
package com.learning.algorithms.powerOfTwo;

/**
 * @author PRASADBolla
 *
 */
public class PowerOfTwo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isPowerOfTwo(8));
	}
	public static boolean isPowerOfTwo(int n){
		long i=1;
		while(i < n){
			System.out.println(i*=2);
			i*=2;
		}
		return i ==n;
	}
}
