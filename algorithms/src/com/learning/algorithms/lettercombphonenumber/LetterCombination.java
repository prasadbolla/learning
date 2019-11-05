/**
 * 
 */
package com.learning.algorithms.lettercombphonenumber;

import java.util.ArrayList;
import java.util.List;

/**
 * @author PRASADBolla
 *
 */
public class LetterCombination {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		System.out.println(letterCombination("23"));
	}
	public static List<String> letterCombination(String digits) {

		List<String> result=new ArrayList<String>();
		if(digits == null || digits.length() == 0)
			return result;
		String[] mapping={
				"0", "1", "abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"
		};
		
		letterCombinationRecurs(result,digits,"",0,mapping);
		
		return result;

	}
	private static void letterCombinationRecurs(List<String> result,
			String digits, String string, int i, String[] mapping) {
		if(i == digits.length()){
			result.add(string);
			return;
		}
		String letters=mapping[digits.charAt(i) - '0'];
		for(int ii=0; ii < letters.length(); ii++){
			letterCombinationRecurs(result, digits, string+letters.charAt(ii), i+1, mapping);
		}
		
	}
}
