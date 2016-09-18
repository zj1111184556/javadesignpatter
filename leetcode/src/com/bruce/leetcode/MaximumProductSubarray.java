package com.bruce.leetcode;
import java.util.Arrays;

public class MaximumProductSubarray {
	public static void main(String[] args){
		int[] nums = new int[]{
				2,3,-2,4
		};
		maxProduct(nums);
	}
	public static int maxProduct(int[] A) {
        final int len = A.length;
        if(A.length<=0) return 0;  
        if(A.length==1) return A[0];  
        int curMax = A[0];  
        int curMin = A[0];  
        int ans = A[0];  
        for(int i=1;i<len;i++){  
            int temp = curMin * A[i];  
            curMin = Math.min(A[i], Math.min(temp, curMax*A[i]));  
            curMax = Math.max(A[i], Math.max(temp, curMax*A[i]));  
            ans = Math.max(ans, curMax);  
        }  
        return ans;         		
    }
}
