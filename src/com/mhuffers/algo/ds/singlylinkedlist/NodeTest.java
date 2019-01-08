package com.mhuffers.algo.ds.singlylinkedlist;

public class NodeTest {
	
	public static void main(String[] args) {
		Node node1 = new Node();
		node1.val = 3;
		
		Node node2 = new Node();
		node2.val = 3;
		
		Node node3 = new Node();
		node3.val = 3;
		
		Node node4 = new Node();
		node4.val = 3;
		
		Node node5 = new Node();
		node5.val = 3;
		
		Node node6 = new Node();
		node6.val = 3;
		
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = node5;
		node5.next = node6;
		
		System.out.println(listLength(node1));
		System.out.println(listLength(node2));
		System.out.println(listLength(node3));
	}
	
	public static int listLength(Node node) {
		int count=1;
		while(node.next != null) {
			count++;
			node = node.next;
		}
		return count;
	}
}
