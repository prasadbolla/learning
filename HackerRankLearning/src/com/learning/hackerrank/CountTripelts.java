package com.learning.hackerrank;

import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CountTripelts {

	// Complete the countTriplets function below.
	static long countTriplets(List<Long> arr, long r) {
		long result = 0;
		Map<Long, Long> count = new HashMap<>();
		Map<Long, Long> triplets = new HashMap<>();

		for (int i = 0; i < arr.size(); ++i) {

			long val = arr.get(i);

			if (val % r == 0 && triplets.containsKey(val / r)) {
				result += triplets.get(val / r);

			}

			if (triplets.containsKey(val)) {
				triplets.put(val, triplets.get(val) + count.get(val / r));

			} else if (val % r == 0 && count.containsKey(val / r)) {

				triplets.put(val, count.get(val / r));
			}

			if (count.containsKey(val))
				count.put(val, count.get(val) + 1);
			else
				count.put(val, 1L);
		}

		return result;
	}

	/*
	 * static long countTriplets(List<Long> arr, long r) { Long[] array = new
	 * Long[arr.size()]; long result = 0; Map<Long, Integer> firstMap = new
	 * HashMap<Long, Integer>(); Map<Long, Integer> secondMap = new
	 * HashMap<Long, Integer>(); for (int i = 0; i < arr.size(); i++) { array[i]
	 * = arr.get(i); firstMap.put(array[i], (int) 0); secondMap.put(array[i],
	 * (int) 0); }
	 * 
	 * for (int i = 0; i < array.length; i++) { Long long1 = array[i];
	 * firstMap.put(long1, firstMap.get(long1) + 1); }
	 * 
	 * for (int i = 0; i < array.length; i++) { Long long2 = array[i];
	 * firstMap.put(long2, firstMap.get(long2) - 1);
	 * 
	 * if (long2 % r == 0) { Long long3 = long2 / r; Long long4 = long2 * r;
	 * 
	 * if (secondMap.containsKey(long3) && firstMap.containsKey(long4)) { result
	 * += (secondMap.get(long3) * firstMap.get(long4)); } }
	 * 
	 * secondMap.put(long2, secondMap.get(long2) + 1); }
	 * 
	 * return result; }
	 */

	public static void main(String[] args) throws IOException {

		long[] arr = { 1, 4, 16, 64 };
		List<Long> list = Arrays.stream(arr).boxed()
				.collect(Collectors.toList());
		long r = 4;
		System.out.println(countTriplets(list, r));

	}
}
