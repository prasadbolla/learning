/**
 * 
 */
package com.learning.hackerrank;

import java.util.Scanner;

/**
 * @author PRASADBolla
 *
 */
public class MinimumBriges {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int scannerNextInt = scanner.nextInt();
		for (int index = 0; index < scannerNextInt; index++) {
			int nextInt = scanner.nextInt();
			int q[] = new int[nextInt];
			for (int index2 = 0; index2 < nextInt; index2++)
				q[index2] = scanner.nextInt();

			int bribe = 0;
			boolean isChaotic = false;
			for (int i = 0; i < nextInt; i++) {
				if (q[i] - (i + 1) > 2) {
					isChaotic = true;
					break;
				}
				for (int j = Math.max(0, q[i] - 2); j < i; j++) {
					if (q[j] > q[i]) {
						bribe++;
					}
				}
			}
			if (isChaotic)
				System.out.println("Too chaotic");
			else
				System.out.println(bribe);
		}
	}
}
