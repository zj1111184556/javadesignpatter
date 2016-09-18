package com.bruce.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SingleNumberIII {
	public static void main(String[] args){
		int[] nums = new int[]{
				1,1,3,4,3,6,6,8,9
		};
		int[] ret = singleNumber(nums);
		for (int o : ret){
			System.out.println(o);
		}
	}
	public static int[] singleNumber(int[] nums) {
		int len = nums.length;
		List<Integer> listN = new ArrayList<Integer>();
        Arrays.sort(nums);
        
        int i = 0;
        while(i < len - 1){
        	if ((nums[i] ^ nums[i+1]) == 0){
        		i += 2;
        	}else{
        		listN.add(nums[i]);
        		i += 1;
        	}
        }

        if (i == (len-1)){
        	listN.add(nums[i]);
        }
    
        int j = 0;
        int[] ret = new int[listN.size()];
        for (Integer n : listN){
        	ret[j] = n;
        	j++;
        }
  
        return ret;
    }
	
}
