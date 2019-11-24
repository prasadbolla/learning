package com.learning.hackerrank;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MaxRotation {

	// Complete the matrixRotation function below.
	static void matrixRotation(List<List<Integer>> matrix, int r) {
		Integer[][] matrixArray = matrix.stream()
				.map(l -> l.stream().toArray(Integer[]::new))
				.toArray(Integer[][]::new);
		int rowSize = matrix.size();
		int columnSize = matrix.get(0).size();
		int length = Math.min(rowSize, columnSize) / 2;
		for (int mat = 0; mat < length; ++mat) {
			for (int x = 0; x < r % (2 * (rowSize + columnSize - 2 - 4 * mat)); x++) {
				int i = mat, j = mat;
				int temp = matrixArray[mat][mat];
				while (i < rowSize - 1 - mat) {
					int temp2 = matrixArray[i + 1][j];
					matrixArray[i + 1][j] = temp;
					temp = temp2;
					i++;
				}

				while (j < columnSize - 1 - mat) {
					int temp2 = matrixArray[i][j + 1];
					matrixArray[i][j + 1] = temp;
					temp = temp2;
					j++;
				}

				while (i > mat) {
					int temp2 = matrixArray[i - 1][j];
					matrixArray[i - 1][j] = temp;
					temp = temp2;
					i--;
				}

				while (j > mat) {
					int temp2 = matrixArray[i][j - 1];
					matrixArray[i][j - 1] = temp;
					temp = temp2;
					j--;
				}
			}
		}

		for (int x = 0; x < matrixArray.length; x++) {
			for (int y = 0; y < matrixArray[x].length; y++) {
				System.out.print(matrixArray[x][y] + " ");
			}

			System.out.println();
		}
		Stream.of(matrixArray).map(Arrays::toString)
				.forEach(System.out::println);

	}

	public static void main(String[] args) {

		Integer a[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 },
				{ 13, 14, 15, 16 } };
		List<List<Integer>> matrix = Arrays.stream(a).map(Arrays::asList)
				.collect(Collectors.toList());

		int r = 3;
		matrixRotation(matrix, r);

	}
}
