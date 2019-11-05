/**
 * 
 */
package com.learning.algorithms.mostcommonword;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

/**
 * @author PRASADBolla
 *
 */
public class FindMostCommonWord {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String paramgraph = "this is prasad this is nakul";
		String[] banned = { "this" };
		HashSet<String> bannedword = new HashSet<>(Arrays.asList(banned));
		HashMap<String, Integer> hashMap = new HashMap<>();
		for (String word : paramgraph.toLowerCase().split(" ")) {
			if (!bannedword.contains(word)) {
				hashMap.put(word, hashMap.getOrDefault(word, 0) + 1);
			}
		}
		String str = "";
		for (String key : hashMap.keySet()) {
			if ((str != null && str.isEmpty())
					|| hashMap.get(key) > hashMap.get(str))
				str = key;
		}
		System.out.println(str);
	}

}
