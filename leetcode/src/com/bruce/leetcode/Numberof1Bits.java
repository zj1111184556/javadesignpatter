package com.bruce.leetcode;

public class Numberof1Bits {
	public static void main(String[] args){
		System.out.println(Math.log10(10));
		System.out.println(hammingWeight(11));
	}
	// you need to treat n as an unsigned value
    public static int hammingWeight(int n) {
    	int total=0;  
        while(n!=0){  
            total++;  
            n=n&(n-1);  
        }  
        return total; 

    }
}
