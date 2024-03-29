package com.learning.dataStructures.stack;

public class Stack {
	private int maxSize;
	private long[] stackArray;
	private int top;

	public Stack(int size) {
		this.maxSize = size;
		this.stackArray = new long[maxSize];
		this.top = -1;
	}

	public void push(long i) {
		top++;
		if (top > maxSize - 1) {
			long[] tempArray = new long[maxSize * 2];
			for (int ii = 0; ii < stackArray.length; ii++) {
				tempArray[ii] = stackArray[ii];
			}
			maxSize = maxSize * 2;
			stackArray = tempArray;
		}
		stackArray[top] = i;
	}

	public long pop() {
		int old_top = top;
		top--;
		return stackArray[old_top];
	}

	public long peak() {
		return stackArray[top];
	}

	public boolean isEmpty() {
		return (top == -1);
	}

	public boolean isFull() {
		return (maxSize - 1 == top);
	}
}
