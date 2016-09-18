package com.bruce.leetcode;
/*
 * 258
 */
public class AddDigits {
	public static void main(String[] args) {
		int nums = 38;
		String sNums = String.valueOf(nums);
		System.out.println(sNums.charAt(0));
		System.out.println(addDigits(38));
	}
	
	public static int addDigits(int num) {
		while(num >= 10){
			System.out.println(num);
			num = num/10 + num%10;
		}
        return num;
    }
	
	
	
	
}
