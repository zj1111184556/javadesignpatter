package com.bruce.effectjava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ComparableStudent implements Comparable<ComparableStudent> {

	public static void main(String[] args){
		ComparableStudent s1 = new ComparableStudent(9);
		ComparableStudent s2 = new ComparableStudent(2);
		ComparableStudent s3 = new ComparableStudent(3);
		
		
		List<ComparableStudent> list = new ArrayList<ComparableStudent>();
		list.add(s1);
		list.add(s2);
		list.add(s3);
		
		ComparableStudent sc[]= {
			 new ComparableStudent(9),
			 new ComparableStudent(2),
			 new ComparableStudent(3)
		};
		
		ComparableStudent cs2 = new ComparableStudent(1);
		Arrays.sort(sc, new ComparatorTest());
		
		for(ComparableStudent s:sc)
        {
            System.out.println(s);
        }
	}
	
    int number;
	@SuppressWarnings("unchecked")
	public ComparableStudent(int number){
		this.number = number;
	}
	
	@Override
	public int compareTo(ComparableStudent o) {
		// TODO Auto-generated method stub
		if (this.number > o.number){
			return -1;
		}else if (this.number < o.number){
			return 1;
		}else{
			return 0;
		}
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.valueOf(number);
	}
	
	
	
	

}
