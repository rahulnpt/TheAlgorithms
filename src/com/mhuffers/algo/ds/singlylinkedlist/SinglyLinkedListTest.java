package com.mhuffers.algo.ds.singlylinkedlist;

import java.util.stream.IntStream;

public class SinglyLinkedListTest {

	public static void main(String[] args) {
		SinglyLinkedList list = new SinglyLinkedList();
		
		IntStream.range(1, 10).forEach(i->list.insertFirst(i*10));
		list.insertLast(1000);
		
		list.insertLast(2000);
		
		list.insertLast(3000);
		list.displayList();
		
	}

}
