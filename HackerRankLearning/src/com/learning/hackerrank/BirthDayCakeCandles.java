package com.learning.hackerrank;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class BirthDayCakeCandles {

	// Complete the birthdayCakeCandles function below.
	static int birthdayCakeCandles(int[] ar) {
		Map<Integer, Integer> count = new HashMap<>();
		for (int i = 0; i < ar.length; i++) {
			int val = ar[i];
			if (count.containsKey(val))
				count.put(val, (count.get(val) + 1));
			else
				count.put(val, (int) 1L);
		}
		return (int) (Collections.max(count.values()));
	}

	public static void main(String[] args) {

		int[] ar = { 3, 2, 1, 3 };
		System.out.println(birthdayCakeCandles(ar));

	}
}
