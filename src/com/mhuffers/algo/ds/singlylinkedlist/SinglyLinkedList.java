package com.mhuffers.algo.ds.singlylinkedlist;

public class SinglyLinkedList {

	private Node first;
	
	private Node last;
	
	public void insertFirst(int data) {
		Node newNode = new Node();
		newNode.val = data;
		newNode.next = first;
		first = newNode;
	}
	
	public Node deleteFirst() {
		Node oldFirst = first;
		first = first.next;
		return oldFirst;
	}
	
	public void insertLast(int data) {
		Node newNode = new Node();
		newNode.val = data;
		
		Node current = first;
		while(current.next != null) {
			current = current.next;
		}
		current.next = newNode;
	}
	
	public void displayList() {
		Node node = first;
		while(node != null) {
			node.displayData();
			node = node.next;	
		}
	}
	
}
