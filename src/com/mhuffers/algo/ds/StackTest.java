package com.mhuffers.algo.ds;

import java.util.stream.IntStream;

public class StackTest {
	
	public static void main(String[] args) {
		
		Stack stack = new Stack();
		
		IntStream.range(0, 100).forEach(i->stack.push(i*10));
		
		IntStream.range(0, stack.length()).forEach(i->System.out.println(stack.pop()));
	}
}
