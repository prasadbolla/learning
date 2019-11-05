/**
 * 
 */
package com.learning.algorithms.meetingintervalstartandend;

import java.util.Arrays;

/**
 * @author PRASADBolla
 *
 */
public class MeetingRoomInterval {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public boolean canAttendMeetings(Interval[] interval){
		int[] start = new int[interval.length];
		int[] end= new int[interval.length];
		for(int i=0; i < interval.length; i ++){
			start[i]=interval[i].start;
			end[i]=interval[i].end;
		}
		Arrays.sort(start);
		Arrays.sort(end);
		for(int i=0; i < start.length; i ++){
			if(start[i+1] < end[i]){
				return false;
			}
		}
		return true;
	}
	
	public class Interval{
		int start;
		int end;
		public Interval() {
			start=0;
			end=0;
		}
		public Interval(int s, int e){
			start=s;
			end=e;
		}
	}
}
