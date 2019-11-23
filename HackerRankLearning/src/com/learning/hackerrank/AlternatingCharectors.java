package com.learning.hackerrank;

import java.io.IOException;
import java.util.Scanner;

public class AlternatingCharectors {

	// Complete the alternatingCharacters function below.
	static int alternatingCharacters(String s) {

		int deletions = 0;
		int count = 1;
		for (int i = 1; i < s.length(); i++) {
			if (s.charAt(i) != s.charAt(i - 1)) {
				deletions += count - 1;
				count = 1;
				continue;
			}
			count++;
		}
		return count;
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		String s = "ABABABAB";

		int result = alternatingCharacters(s);

		System.out.println(result);
	}
}
