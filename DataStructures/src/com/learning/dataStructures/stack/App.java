/**
 * 
 */
package com.learning.dataStructures.stack;

/**
 * @author PRASADBolla
 *
 */
public class App {
	public static void main(String[] arg){
		Stack stack = new Stack(4);
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.push(50);
		while(!stack.isEmpty()){
			System.out.println(stack.pop());
		}
	}
}
