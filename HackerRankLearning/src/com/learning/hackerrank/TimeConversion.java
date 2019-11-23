package com.learning.hackerrank;

public class TimeConversion {

	/*
	 * Complete the timeConversion function below.
	 */
	static String timeConversion(String s) {
		String[] tempArray = s.split(":");
		String hours = tempArray[0];
		String minutes = tempArray[1];
		String seconds = tempArray[2];
		int tempHours;

		if (seconds.indexOf("PM") > -1) {
			if (Integer.parseInt(hours) < 12) {
				tempHours = Integer.parseInt(hours);
				tempHours += 12;
				hours = Integer.toString(tempHours);
			}
		} else {
			if (Integer.parseInt(hours) == 12) {
				hours = "00";
			}
		}
		return (hours + ":" + minutes + ":" + seconds.substring(0, 2));
	}

	public static void main(String[] args) {

		String s = "07:05:45PM";
		System.out.println(timeConversion(s));

	}
}