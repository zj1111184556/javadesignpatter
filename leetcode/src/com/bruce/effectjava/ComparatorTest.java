package com.bruce.effectjava;

import java.util.Comparator;

public class ComparatorTest implements Comparator<ComparableStudent>{

	@Override
	public int compare(ComparableStudent o1, ComparableStudent o2) {
		// TODO Auto-generated method stub
		if (o1.number > o2.number){
			return -1;
		}else if (o1.number < o2.number){
			return 1;
		}else{
			return 0;
		}
	}
} 