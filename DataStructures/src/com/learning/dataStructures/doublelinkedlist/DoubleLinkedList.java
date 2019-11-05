package com.learning.dataStructures.doublelinkedlist;

public class DoubleLinkedList {
	private Node first;
	private Node last;

	public DoubleLinkedList() {
		this.first = null;
		this.last = null;
	}

	public boolean isEmpty() {
		return (this.first == null);
	}

/*	public void insertFirst(int data) {
		Node newNode = new Node();
		newNode.data = data;
		Node tempLast=null;
		if (isEmpty()) {
			this.first = newNode;
			tempLast=newNode;
		} else {
			newNode.next=this.first;
			this.first.previous=newNode;
			tempLast=this.first;
			this.first=newNode;
		}
		last = tempLast;
		System.out.println("hello");
	}*/
	public void insertFirst(int data) {
		Node newNode = new Node();
		newNode.data = data;
		if (isEmpty()) {
			this.first = newNode;
		} else {
		last.next=newNode;
			newNode.previous=last;
		}
		last = newNode;
		System.out.println("hello");
	}
	public void insertLast(int data) {

	}
}
