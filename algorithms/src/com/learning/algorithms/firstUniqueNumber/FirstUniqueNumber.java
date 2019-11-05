/**
 * 
 */
package com.learning.algorithms.firstUniqueNumber;

import java.util.HashSet;

/**
 * @author PRASADBolla
 *
 */
public class FirstUniqueNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(singleNumber(new int[]{2,3,1,3}));
	}
	public static Integer singleNumber(int[] nums){
		HashSet<Integer> hashSet= new HashSet<Integer>();
		for(int i: nums){	
			if(hashSet.contains(i)){
				hashSet.remove(i);
			}else{
				hashSet.add(i);
			}
		}
		return hashSet.stream().findFirst().get();
	}
}
