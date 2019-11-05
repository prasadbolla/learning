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
public class PartitionString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//String[] namesArr = names.stream().toArray(String[]::new);
		
		String s= "ababcbacadefegdehijhklijz";	
		
		/*hello.chars()
        .forEach(i -> System.out.println((char)i));*/
		List<Integer> partitionLengths=new ArrayList<>();
		int[] lastIndex= new int[26];
		for(int i=0; i < s.length(); i++){
			lastIndex[s.charAt(i)-'a']=i;
			//Data representation: [8, 5, 7, 14, 15, 11, 13, 19, 22, 23, 20, 21, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 24]
		}
		int i=0;
		while(i < s.length()){
			int end=lastIndex[s.charAt(i)-'a'];
			int j=i;
			while(j != end){
				end = Math.max(end, lastIndex[s.charAt(j)-'a']);
				j++;
			}
			partitionLengths.add(j-i+1);
			i=j+1;
		}
		partitionLengths.forEach(item->System.out.println(item));
	}
 
}
