package com.learning.hackerrank;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RansomeWords {

	public static void canMake(String[] magazine, String[] note) {
		Map<String, Integer> magazineWords = new HashMap<String, Integer>();
		Map<String, Integer> noteWords = new HashMap<String, Integer>();

		for (String word : magazine) {
			if (!magazineWords.containsKey(word)) {
				magazineWords.put(word, 0);
			} else {
				magazineWords.put(word, magazineWords.get(word) + 1);
			}
		}

		for (String word : note) {
			if (!noteWords.containsKey(word)) {
				noteWords.put(word, 0);
			} else {
				noteWords.put(word, noteWords.get(word) + 1);
			}
		}
		boolean found = true;
		if (magazineWords.isEmpty()) {
			found = false;
		} else {
			for (String key : noteWords.keySet()) {
				if (!magazineWords.containsKey(key))
					found = false;
				int needed = noteWords.get(key);
				if (magazineWords.get(key) != null && magazineWords.get(key) < needed)
					found = false;
			}
		}
		System.out.println(found ? "Yes" : "No");

	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int m = in.nextInt();
		int n = in.nextInt();
		String magazine[] = new String[m];
		for (int magazine_i = 0; magazine_i < m; magazine_i++) {
			magazine[magazine_i] = in.next();
		}
		String ransom[] = new String[n];
		for (int ransom_i = 0; ransom_i < n; ransom_i++) {
			ransom[ransom_i] = in.next();
		}

		canMake(magazine, ransom);
	}

}
