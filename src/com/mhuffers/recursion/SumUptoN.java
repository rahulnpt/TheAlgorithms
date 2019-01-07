package com.mhuffers.recursion;

public class SumUptoN {

	public static void main(String[] args) {
		//System.out.println(new Factorial().findSumUptoN(0, 10));
	}
	
	public int findSumUptoN(int currentSum,int n) {
		if(n<=0) {
			return currentSum;
		}
		return findSumUptoN(currentSum+n, n-1);
	}
}
