package com.learning.hackerrank;


public class FraudulentActivity {
	public static int activityNotifications(int[] expenditure, int d) {
		int result = 0;
		int[] counter = new int[200];
		for (int i = 0; i < d; i++) {
			counter[expenditure[i]]++;
		}
		for (int i = d; i < expenditure.length; i++) {
			int medianNumber = getMedianNumber(counter, d);
			if (medianNumber <= expenditure[i]) {
				result++;
			}
			counter[expenditure[i - d]]--;
			counter[expenditure[i]]++;
		}
		return result;
	}

	public static int getMedianNumber(int[] count, int d) {
		int sum = 0;
		for (int i = 0; i < count.length; i++) {
			sum += count[i];
			if ((2 * sum) == d) {
				return (2 * i + 1);
			} else if ((2 * sum) > d) {
				return (i * 2);
			}
		}
		return 1;
	}

	public static void main(String[] args) {
	int[] expenditure={10,20,30,40,50};
		int d=3;
		/*	Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int d = in.nextInt();
		int[] expenditure = new int[n];
		for (int i = 0; i < n; i++) {
			expenditure[i] = in.nextInt();
		}*/
		int result = activityNotifications(expenditure, d);
		System.out.println(result);
		
	}
}