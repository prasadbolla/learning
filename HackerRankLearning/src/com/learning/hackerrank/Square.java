package com.learning.hackerrank;

public class Square {

	// Complete the squares function below.
	static int squares(int a, int b) {
		int start = (int) Math.sqrt(a);
		int end = (int) Math.sqrt(b);

		int squareIntegers = end - start;

		squareIntegers += (Math.pow(start, 2) >= a) ? 1 : 0;
		return squareIntegers;
	}

	public static void main(String[] args) {

		System.out.println(squares(3, 9));
		System.out.println((double) Math.sqrt(9));
	}
}
