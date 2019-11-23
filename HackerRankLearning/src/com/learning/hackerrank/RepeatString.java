package com.learning.hackerrank;

import java.io.IOException;
import java.util.Scanner;

public class RepeatString {
	static long repeatedString(String s, long n) {
		long counter = 0;

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'a')
				counter++;
		}

		long d = n / s.length();
		long r = n % s.length();

		counter = d * counter;

		for (int ii = 0; ii < r; ii++) {
			if (s.charAt(ii) == 'a')
				counter++;
		}

		return counter;
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {

	    String s = scanner.nextLine();
	    long n = scanner.nextLong();
	    long result = repeatedString(s, n);
	    System.out.print(result);
	    scanner.close();
	}

	}

