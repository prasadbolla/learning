package com.learning.dataStructures.linkedlist;

public class SingleLinkedList {
private Node first;
private Node last;
public boolean isEmpty(){
	return (first == null);
}
public void insertFirst(int data){
	Node newNode= new Node();
	newNode.data=data;
	newNode.next=first;
	first=newNode;
}
public Node deleteFirst(){
	Node temp=first;
	first=first.next;
	return temp;
}
public void displayList(){
	System.out.println("first to last");
	Node current = first;
	while(current != null){
		current.displayNode();
		current = current.next;
	}
}
public void insertLast(int data){
	Node current=first;
	while(current != null){
		current=current.next;
	}
	Node newNode= new Node();
	newNode.data=data;
	current.next=newNode;
}
}
