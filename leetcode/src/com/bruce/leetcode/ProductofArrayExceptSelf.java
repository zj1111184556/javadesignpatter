package com.bruce.leetcode;

public class ProductofArrayExceptSelf {
	public static void main(String[] args) {
		int[] nums = new int[]{
				1,0
		};
		System.out.println(0^0);
		for (int i : productExceptSelf(nums)){
			System.out.println(i);
		}
		
	}
	public static int[] productExceptSelf(int[] nums) {
		if (nums.length == 0 || nums.length == 1) return nums ;

		int product = 0;
		int hasZero = 0;
		for (int i : nums){
			if (i != 0){
			    product = product == 0 ? 1 :  product;
				product = product * i;
			}else{
			    hasZero += 1;
			}			
		}
		int[] ret = new int[nums.length];
		for (int j = 0; j< nums.length; j++){
			if (nums[j] != 0){
				ret[j] = hasZero >= 1? 0 : product/nums[j];				
			}else{
				ret[j] = hasZero >= 1? 0 : product;
			}
		}
        return ret;   
        
	}
}
