package com.learning.dataStructures.linkedlist;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*		Node nodea= new Node();
		nodea.data=4;
		Node nodeb= new Node();
		nodeb.data=3;	
		
		Node nodec= new Node();
		nodec.data=7;
		Node noded= new Node();
		noded.data=8;	
		
		nodea.next=nodeb;
		nodeb.next=nodec;
		nodec.next=noded;*/
		SingleLinkedList linkedList = new SingleLinkedList();
		linkedList.insertFirst(10);
		linkedList.insertFirst(20);
		linkedList.insertFirst(30);
		linkedList.insertFirst(40);
		
		linkedList.displayList();
	}

}
