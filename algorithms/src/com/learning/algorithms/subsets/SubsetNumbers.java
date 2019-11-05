/**
 * 
 */
package com.learning.algorithms.subsets;

import java.util.ArrayList;
import java.util.List;

/**
 * @author PRASADBolla
 *
 */
public class SubsetNumbers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] nums={1,2,3};
	List<List<Integer>> subsets = new ArrayList<>();
	generateSubsets(0,nums,new ArrayList<Integer>(), subsets);
	subsets.forEach(f->System.out.println(f.toString()));
	System.out.println("done");
	}

	private static void generateSubsets(int index, int[] nums, ArrayList current,
			List<List<Integer>> subsets) {
	subsets.add(new ArrayList<>(current));
		for(int i=index; i< nums.length; i++){
			current.add(nums[i]);
			generateSubsets(i+1, nums, current, subsets);
			current.remove(current.size()-1);
		}
	}

}
