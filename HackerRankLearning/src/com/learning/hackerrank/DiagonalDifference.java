package com.learning.hackerrank;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Result {

	public static int diagonalDifference(List<List<Integer>> arr) {

		Integer[][] array = arr.stream()
				.map(l -> l.stream().toArray(Integer[]::new))
				.toArray(Integer[][]::new);

		int diagonal1 = 0, diagonal2 = 0;
		int lenght = array.length;
		for (int i = 0; i < lenght; i++) {
			diagonal1 += array[i][i];
			diagonal2 += array[i][lenght - i - 1];
		}
		return Math.abs(diagonal1 - diagonal2);
	}

}

public class DiagonalDifference {
	public static void main(String[] args) {

		Integer arra[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 9, 8, 9 } };

		List<List<Integer>> arr = Arrays.stream(arra).map(Arrays::asList)
				.collect(Collectors.toList());
		System.out.println(Result.diagonalDifference(arr));

	}
}
