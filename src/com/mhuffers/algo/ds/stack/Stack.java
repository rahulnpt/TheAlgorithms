package com.mhuffers.algo.ds.stack;

import java.util.Arrays;

public class Stack {
	
	private static int DEFAULT_SIZE=10;
	
	private int STACK_ARRAY[] = new int[DEFAULT_SIZE];
	
	private static int top=-1;
	
	public Stack() {
	}
	
	public Stack(int size) {
		DEFAULT_SIZE = size;
	}
	
	public void push(int value) {
		top++;
		if(top < DEFAULT_SIZE) {
			STACK_ARRAY[top] = value;
		}else {
			STACK_ARRAY = Arrays.copyOf(STACK_ARRAY, length()+10);
			STACK_ARRAY[top] = value;
			DEFAULT_SIZE = STACK_ARRAY.length;
		}
	}

	public int pop() {
		int curr_val = STACK_ARRAY[top];
		top--;
		return curr_val;
	}
	
	public boolean isEmpty() {
		return top == -1;
	}
	
	public int peak() {
		return STACK_ARRAY[top];
	}
	
	public int length() {
		return top+1;
	}
	
}
