package com.learning.hackerrank;

public class ReverseShuffleMerge {

	// Complete the reverseShuffleMerge function below.
	static String reverseShuffleMerge(String s) {

		int[] frequency = new int[26];
		int uniqueElement = 0;
		for (int i = 0; i < s.length(); i++) {
			char currentChar = s.charAt(i);
			if (frequency[currentChar - 'a'] == 0) {
				uniqueElement++;
			}
			frequency[currentChar - 'a']++;
		}

		for (int i = 0; i < 26; i++) {
			frequency[i] = frequency[i] / 2;
		}
		int lastIndex = s.length();
		StringBuilder result = new StringBuilder(lastIndex / 2);
		while (uniqueElement > 0) {

			int[] tempFrequency = frequency.clone();
			int tempUniqueElement = uniqueElement;
			int windowSize = 0;

			for (int i = 0; i < s.length(); i++) {
				char currentChar = s.charAt(i);
				tempFrequency[currentChar - 'a']--;
				if (tempFrequency[currentChar - 'a'] == 0)
					tempUniqueElement--;
				if (tempUniqueElement == 0)
					break;
				windowSize++;
			}
			Character minCharacter = null;
			for (int i = lastIndex - 1; i >= windowSize; i--) {
				if (frequency[s.charAt(i) - 'a'] == 0) {
					continue;
				}
				if (minCharacter == null || minCharacter > s.charAt(i)) {
					minCharacter = s.charAt(i);
					lastIndex = i;
				}
			}
			result.append(minCharacter);
			frequency[minCharacter - 'a']--;
			if (frequency[minCharacter - 'a'] == 0) {
				uniqueElement--;
			}
		}
		return result.toString();
	}

	public static void main(String[] args) {

		String s = "aeiouuoiea";
		System.out.println(reverseShuffleMerge(s));

	}
}
