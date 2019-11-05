/**
 * 
 */
package com.learning.algorithms.partition;

import java.util.ArrayList;
import java.util.List;

/**
 * @author PRASADBolla
 *
 */
public class PartitionStringSecond {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String s = "ababcbacadefegdehijhklijz";
		// 1.Define list to store the partition list
		List<Integer> partitionList = new ArrayList<>();
		// 2. Define array to store the last index of each charactor with
		// constant value 26
		int[] lastIndex = new int[26];
		// 3. interate through each char and udpate the lastIndex
		for (int i = 0; i < s.length(); i++) {
			lastIndex[s.charAt(i) - 'a'] = i;
		}
		// 4. iterate through the each char
		int index = 0;
		while (index < s.length()) {
			// 5. Get the end of char index
			int end = lastIndex[s.charAt(index) - 'a'];
			int nextCharIndex = index;
			while (nextCharIndex != end) {
				end = Math.max(end, lastIndex[s.charAt(nextCharIndex) - 'a']);
				nextCharIndex++;
			}
			partitionList.add(nextCharIndex-index + 1);
			index = nextCharIndex + 1;
		}
		partitionList.forEach(item->System.out.println(item));
	}

}
