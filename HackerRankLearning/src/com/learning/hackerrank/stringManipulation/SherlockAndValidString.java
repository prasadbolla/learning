package com.learning.hackerrank.stringManipulation;

import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class SherlockAndValidString {

	// Complete the isValid function below.
	static String isValid(String s) {
		String YES = "YES";
		String NO = "NO";
		Map<Character, Integer> letterCounterMapMap = new HashMap<>();
		for (char letter : s.toCharArray()) {
			if (letterCounterMapMap.containsKey(letter))
				letterCounterMapMap.put(letter, letterCounterMapMap.get(letter) + 1);
			else
				letterCounterMapMap.put(letter, 1);
		}
		Set<Integer> letterCounterValue = new HashSet<>();
		for (int freq : letterCounterMapMap.values()) {
			letterCounterValue.add(freq);
		}

		if (letterCounterValue.size() > 2)
			return NO;
		else if (letterCounterValue.size() == 1)
			return YES;
		else
		{
			int int1 = 0;
			int int2 = 0;
			int int1Count = 0;
			int int2Count = 0;
			int i = 0;
			for (int n : letterCounterValue) {
				if (i == 0)
					int1 = n;
				else
					int2 = n;
				i++;
			}

			for (int freq : letterCounterMapMap.values()) {
				if (freq == int1)
					int1Count++;
				if (freq == int2)
					int2Count++;
			}

			if ((int1 == 1 && int1Count == 1) || (int2 == 1 && int2Count == 1))
				return YES;
			else if ((Math.abs(int1 - int2) == 1) && (int1Count == 1 || int2Count == 1))
				return YES;
			else
				return NO;
		}
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {

		String s = "AABBC";
		System.out.println(isValid(s));

	}
}