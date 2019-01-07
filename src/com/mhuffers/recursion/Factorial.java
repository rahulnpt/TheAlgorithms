package com.mhuffers.recursion;

public class Factorial {

	public static void main(String[] args) {
		Factorial factorial = new Factorial();
		//System.out.println(factorial.findFactorial(5));
		factorial.recursiveDemo(10);
	}
	
	public int findFactorial(int n) {
		if (n >= 1) {
	        return findFactorial(n - 1) + n;
	    }
	    return n;
	}
	int count=0;
	public void recursiveDemo(int x) {
		if(x>=0) {
			recursiveDemo(x-1);
		}
		System.out.println("completed " +x);
	}
}
