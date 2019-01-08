package com.mhuffers.algo.ds.stack;

import java.util.stream.IntStream;

public class StackTest {
	
	public static void main(String[] args) {
		StackTest stackTest = new StackTest();
		
		stackTest.basicTest();

		int reversedNumberWithoutStack = stackTest.reverseNumberWithoutStack(1234);
		System.out.println(reversedNumberWithoutStack);
		
		int reversedNumberWithStack = stackTest.reverseNumberWithoutStack(789456123);
		System.out.println(reversedNumberWithStack);
	}

	private void basicTest() {
		Stack stack = new Stack();
		
		IntStream.range(0, 100).forEach(i->stack.push(i*10));
		
		while(!stack.isEmpty()) {
			System.out.println(stack.pop());
		}
	}
	
	public int reverseNumberWithoutStack(int num) {
		int remainder = 0;
		int reversedNum=0;
		while(num%10>0) {
			remainder = num%10;
			num = num/10;
			reversedNum = reversedNum*10+remainder;
		}
		return reversedNum;
	}
	
	public int reverseNumberWithStack(int num) {
		Stack stack = new Stack();
		while(num%10>0) {
			stack.push(num%10);
			num = num%10;
		}
		int reversedNum =0;
		int top = 0;
		
		while(!stack.isEmpty()) {
			top = stack.pop();
			reversedNum = reversedNum*10+top; 
		}
		return reversedNum;
	}
}
