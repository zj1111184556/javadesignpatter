package com.bruce.leetcode;

public class PowerofThree {
	public static void main(String[] args){
		String[] words = new String[]{
		"war", "mars", "true"};
		int len = words.length;  
        int[] mask = new int[len];  
        for(int i=0;i<len;i++) {  
            for(int j=0;j<words[i].length();j++) {  
            	//System.out.println(words[i].charAt(j) - 'a');
                mask[i] |= 1 << (words[i].charAt(j)-'a');  
            }  
        }
        int max = 0;  
        for(int i=0;i<len;i++) {  
            for(int j=i+1;j<len;j++) {  
                if((mask[i] & mask[j]) == 0) {  
                    max = Math.max(max, words[i].length() * words[j].length());  
                }  
            }  
        }  
 
        System.out.println(1 << 4);
        System.out.println(Integer.toBinaryString(4));
        System.out.println(Integer.toBinaryString(1 << 4));
        
        for (int i : mask){
        	//System.out.println("" + i);
        }
		
	}
	
	public boolean isPowerOfThree(int n) {
        double res = Math.log(n)/Math.log(3);  
        return Math.abs(res - Math.rint(res))< 0.0000000001; 
    } 

}
