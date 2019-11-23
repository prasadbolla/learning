package com.learning.hackerrank.stringManipulation;

import java.io.IOException;

public class AlternatCharacters {

	// Complete the alternatingCharacters function below.
	static int alternatingCharacters(String s) {
		int count = 0;
		for (int i = 1; i < s.length(); i++) {
			if (s.charAt(i) != s.charAt(i - 1)) {
				continue;
			}
			count++;
		}
		return count;
	}

	public static void main(String[] args) throws IOException {
		String s = "BBBBB";

		int result = alternatingCharacters(s);

		System.out.println(result);
	}
}
