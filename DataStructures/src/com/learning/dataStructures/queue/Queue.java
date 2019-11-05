package com.learning.dataStructures.queue;

public class Queue {
 private int maxSize;
 private long [] queueArray;
 private int front;
 private int rear;
 private int nItems;
 public Queue(int maxSize){
	 this.maxSize = maxSize;
	 queueArray = new long[maxSize];
	 front =0;
	 rear = -1;
	 nItems=0;
 }
 public void insert(long i){
	 rear++;
	 queueArray[rear] =i;
	 nItems++; 
 }
 public void view(){
	 System.out.print("[");
	 for(int i=0; i < queueArray.length; i++){
		 System.out.print(queueArray[i]+ " ");
	 }
	 System.out.print("]");
 }
}
