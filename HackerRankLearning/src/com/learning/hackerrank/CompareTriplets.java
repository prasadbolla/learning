package com.learning.hackerrank;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CompareTriplets {

    // Complete the compareTriplets function below.
    static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {

		int alice = 0;
		int bob = 0;
		alice = ((a.get(0) > b.get(0)) ? 1 : 0)
				+ ((a.get(1) > b.get(1)) ? 1 : 0)
				+ ((a.get(2) > b.get(2)) ? 1 : 0);
		bob = ((b.get(0) > a.get(0)) ? 1 : 0) + ((b.get(1) > a.get(1)) ? 1 : 0)
				+ ((b.get(2) > a.get(2)) ? 1 : 0);
		List<Integer> result = new ArrayList<Integer>();
		result.add(alice);
		result.add(bob);

		return result;
    }

    public static void main(String[] args) throws IOException {

    	int[] arr = { 17, 28, 30};
    	int[] arr1 = { 99, 16, 8};
		List<Integer> a = Arrays.stream(arr).boxed()
				.collect(Collectors.toList());
		List<Integer> b = Arrays.stream(arr1).boxed()
				.collect(Collectors.toList());
		List<Integer> result = compareTriplets(a, b);
		result.stream().forEach(i -> System.out.print(i+" "));


    }
}
