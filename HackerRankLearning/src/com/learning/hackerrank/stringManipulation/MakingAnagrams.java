package com.learning.hackerrank.stringManipulation;

import java.util.Scanner;

public class MakingAnagrams {
	public static int numberNeeded(String a, String b) {
		int[] firstOccur = new int[26];
		int[] secondOccur = new int[26];
		int deletions = 0;

		for (int i = 0; i < a.length(); i++)
			firstOccur[a.charAt(i) - 'a'] = firstOccur[a.charAt(i) - 'a'] + 1;
		for (int i = 0; i < b.length(); i++)
			secondOccur[b.charAt(i) - 'a'] = secondOccur[b.charAt(i) - 'a'] + 1;

		for (int i = 0; i < 26; i++)
			deletions += Math.abs(firstOccur[i] - secondOccur[i]);

		return deletions;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String a = in.next();
		String b = in.next();
		System.out.println(numberNeeded(a, b));
	}
}