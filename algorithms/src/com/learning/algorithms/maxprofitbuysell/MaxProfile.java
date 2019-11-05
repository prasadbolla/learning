/**
 * 
 */
package com.learning.algorithms.maxprofitbuysell;

/**
 * @author PRASADBolla
 *
 */
public class MaxProfile {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(maxProfit(new int[]{1,4,5,7,8}));
	}
	public static int maxProfit(int[] prices){
		if(prices == null && prices.length == 0)
			return 0;
		int profit=0;
		for(int i=0; i < prices.length -1;i++){
			if(prices[i +1] > prices[i]){
				profit+=prices[i+1]-prices[i];
			}
		}
		return profit;
	}
}
