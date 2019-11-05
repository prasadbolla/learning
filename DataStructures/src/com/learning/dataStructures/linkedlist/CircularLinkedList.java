/**
 * 
 */
package com.learning.dataStructures.linkedlist;

/**
 * @author PRASADBolla
 *
 */
public class CircularLinkedList {
	private Node first;
	private Node last;
	private int data;

	public void insertFirst(int data) {
		Node newNode = new Node();
		newNode.data = data;
		if (first == null)
			last = newNode;

		newNode.next = first;
		first = newNode;
	}

	public void insertLast(int data) {
		Node newNode = new Node();
		newNode.data = data;

		if (first == null) {
			first = newNode;
		} else {
			last.next = newNode;
			last = newNode;
		}
	}
	
	public int deleteFirst(){
		int temp = first.data;
		if(first.next==null){
			last = null;
		}
		first=first.next;
		return temp;
	}
}
