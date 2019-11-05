/**
 * 
 */
package com.learning.algorithms.roboReturnToOrigin;

/**
 * @author PRASADBolla
 *
 */
public class JudgeCircle {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(judgeCir("UDU"));
	}
	public static boolean judgeCir(String moves){
		int UD=0;
		int LR=0;
		for(int i=0; i < moves.length(); i ++){
			char currentMove = moves.charAt(i);
			if(currentMove == 'U'){
				UD++;
			}else if(currentMove == 'D'){
				UD--;
			}else if(currentMove == 'L'){
				LR++;
			}else if(currentMove == 'R'){
				LR--;
			}
		}
		return UD ==0 && LR==0;
	}
}
