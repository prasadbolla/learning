/**
 * 
 */
package com.learning.algorithms.removeelementwithoutarray;

/**
 * @author PRASADBolla
 *
 */
public class RemoveElementWithoutAdditionalArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(removeElement(new int[]{2,3,3,2},  3));
		System.out.println(removeElements(new int[]{2,3,3,2},  3));
	}
	
	public static int removeElement(int[] nums, int val){
		int index=0;
		for(int i: nums){
			if(i != val){
				nums[index++]=i;
			}
		}
		return index;
	}
	public static int[] removeElements(int[] nums, int val){
		int index=0;
		for(int i: nums){
			if(i != val){
				nums[index++]=i;
			}
		}
		return nums;
	}
}
