package com.learning.hackerrank;



public class Staircase {

	// Complete the staircase function below.
	static void staircase(int n) {
		StringBuilder staircase = new StringBuilder("");

		for (int index = 0; index < n; index++) {
			staircase.append(" ");
		}	
		for (int index = 1; index < n + 1; index++) {
			staircase.setCharAt(n - index, '#');
			System.out.println(staircase);
		}

	}


	public static void main(String[] args) {

		int n = 6;
		staircase(n);

	}
}