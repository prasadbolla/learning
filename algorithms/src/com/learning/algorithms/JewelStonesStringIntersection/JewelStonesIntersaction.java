/**
 * 
 */
package com.learning.algorithms.JewelStonesStringIntersection;

import java.util.HashSet;

/**
 * @author PRASADBolla
 *
 */
public class JewelStonesIntersaction {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(numJewelsInStones("as", "asoioslkjs"));
	}
	public static int numJewelsInStones(String j, String s){
		HashSet<Character> jewels = new HashSet<Character>();
		for(char c: j.toCharArray()){
			jewels.add(c);
		}
		int numJewels =0;
		for(char c: s.toCharArray()){
			if(jewels.contains(c)){
				numJewels++;
			}
		}
		return numJewels;
	}
}
