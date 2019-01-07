package com.mhuffers.algo.ds;

import java.util.Arrays;

public class Stack {
	
	private static int DEFAULT_SIZE=10;
	
	private int STACK_ARRAY[] = new int[DEFAULT_SIZE];
	
	private static int CURRENT_INDEX=-1;
	
	public Stack() {
	}
	
	public Stack(int size) {
		DEFAULT_SIZE = size;
	}
	
	public void push(int value) {
		CURRENT_INDEX++;
		if(CURRENT_INDEX < DEFAULT_SIZE) {
			STACK_ARRAY[CURRENT_INDEX] = value;
		}else {
			STACK_ARRAY = Arrays.copyOf(STACK_ARRAY, length()+10);
			STACK_ARRAY[CURRENT_INDEX] = value;
			DEFAULT_SIZE = STACK_ARRAY.length;
		}
	}

	public int pop() {
		int curr_val = STACK_ARRAY[CURRENT_INDEX];
		CURRENT_INDEX--;
		return curr_val;
	}
	
	public int length() {
		return CURRENT_INDEX+1;
	}
	
}
