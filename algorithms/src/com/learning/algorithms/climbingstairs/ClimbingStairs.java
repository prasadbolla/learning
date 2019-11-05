/**
 * 
 */
package com.learning.algorithms.climbingstairs;

/**
 * @author PRASADBolla
 *
 */
public class ClimbingStairs {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(climbStairs(4));
		System.out.println(climbStairsRecursion(4));
		System.out.println(climbStairsBottomUp(4));
		System.out.println(climbStairsBottomUpSecondVariation(4));
		System.out.println(climbStairsBottomUpVariation(4));
		
	}

	public static int climbStairs(int n) {
		int[] dp = new int[n + 1];
		dp[0] = 1;
		dp[1] = 1;
		for (int i = 2; i <= n; i++) {
			dp[i] = dp[i - 1] + dp[i - 2];
		}

		return dp[n];
	}

	public static int climbStairsRecursion(int n) {
		if (n == 0 || n == 1)
			return 1;
		return climbStairsRecursion(n - 1) + climbStairsRecursion(n - 2);
	}

	public static int climbStairsBottomUp(int n) {
		if (n == 0 || n == 1)
			return 1;
		int[] nums = new int[n + 1];

		nums[0] = 1;
		nums[1] = 1;
		for (int i = 2; i <= n; i++) {
			nums[i] = nums[i - 1] + nums[i - 2];
		}
		return nums[n];
	}
	public static int climbStairsBottomUpSecondVariation(int n) {
		if (n == 0)
			return 1;
			int total =0;
		for(int i=0; i < new int[]{1,3,5}.length; i++){
			if(n-i >=0)
				total+=climbStairsBottomUpSecondVariation(n-1);
		}
			
		return total;
	}
	public static int climbStairsBottomUpVariation(int n) {
		if (n == 0)
			return 1;
		int[] nums = new int[n + 1];
		nums[0] = 1;
		nums[1] = 1;
		for (int i = 2; i <= n; i++) {
			int total =0;
			for(int j=0; j < new int[]{1,3,5}.length; j++){
				if(i -j >=0){
					total+=nums[i-j];
				}
				nums[i]=total;
			}
		}
		return nums[n];
	}
}
