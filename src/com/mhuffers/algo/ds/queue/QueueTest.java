package com.mhuffers.algo.ds.queue;

import java.util.stream.IntStream;

public class QueueTest {
	
	public static void main(String[] args) {
		
		QueueTest queueTest = new QueueTest();
		queueTest.basicTest();
		
	}
	
	private void basicTest() {
		Queue queue = new Queue();
		
		IntStream.range(1, 10).forEach(i->queue.push(i*10));
		
		while(!queue.isEmpty()) {
			System.out.println(queue.pop());
		}
	}
}
