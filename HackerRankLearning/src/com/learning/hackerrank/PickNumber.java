package com.learning.hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PickNumber {
	public static void main(String[] args) {

		List<Integer> a = new ArrayList<>(Arrays.asList(1, 2, 2, 3, 1, 2));
		System.out.println(pickingNumbers(a));

	}

	public static int pickingNumbers(List<Integer> a) {
		Collections.sort(a);
		int start = 0;
		int index = 0;
		int max = 0;
		while (index < a.size()) {
			if (Math.abs(a.get(start) - a.get(index)) > 1) {
				start = index;
			}
			max = Math.max(max, index - start + 1);
			index++;
		}
		index--;

		return Math.max(max, index - start + 1);
	}

}
