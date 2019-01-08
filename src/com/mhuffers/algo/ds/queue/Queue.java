package com.mhuffers.algo.ds.queue;

public class Queue {
	
	private int queueArray[];
	
	private static int DEFAULT_SIZE = 10;
	
	private int first = -1;

	private int last = -1;
	
	public Queue(){
		queueArray = new int[DEFAULT_SIZE];
	}
	
	public Queue(int defaultSize){
		queueArray = new int[defaultSize];
	}
	
	public void push(int num) {
		if(first == -1) {
			first++;
		}
		last ++;
		queueArray[last] = num;
	}
	
	public int pop() {
		if(isEmpty()) {
			System.out.println("No elements in the Queue yet");
			return -1;
		}else {
			int firstVal = queueArray[first];
			first++;
			return firstVal;
		}
	}
	
	public int peak() {
		return queueArray[first];
	}
	
	public int length() {
		if(isEmpty()) {
			return 0;
		}else {
			return last-first+1;
		}
	}
	
	public boolean isEmpty() {
		return first- last==1;
	}
	
}
