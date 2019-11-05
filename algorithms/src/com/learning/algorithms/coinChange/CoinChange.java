/**
 * 
 */
package com.learning.algorithms.coinChange;

import java.util.Arrays;

/**
 * @author PRASADBolla
 *
 */
public class CoinChange {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.err.println(coinChange(new int[]{1,2,5}, 11));
	}
	public static int coinChange(int[] coins, int amount){
		Arrays.sort(coins);
		int[] dp = new int[amount+1];
		Arrays.fill(dp, amount+1);
		dp[0]=0;
		for(int i=0; i <=amount; i++){
			for(int j=0; j < coins.length; j++){
				if(coins[j]<=i){
					dp[i]=Math.min(dp[i], 1+dp[i-coins[j]]);
				}else{
					break;
				}
			}
		}
		
		return dp[amount]> amount?-1:dp[amount];
	}
}
