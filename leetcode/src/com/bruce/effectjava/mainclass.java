package com.bruce.effectjava;
import java.util.Arrays;
import java.util.List;

import com.bruce.effectjava.InnerClass.StaticInnerClass;
import com.bruce.effectjava.utillity;
interface ShowSomeThing{
	void show();
}
public class mainclass {
	public static void main(String[] args){
		
		ComparableStudent sb1 = new ComparableStudent(1);
		StaticInnerClass sc = new StaticInnerClass();
		utillity u = new utillity();
		String s = "name";
		utillity.show show = new utillity.show();
		show.ShowSomeThing();
		List<String> listS =  Arrays.asList("1","2","3");
		System.out.println(listS.toString());
		int[] args2 = new int[]{1,2,3};
		System.out.println(Arrays.toString(args));
		sum(args2);
		
		utillity u2 = new utillity(){
			public void view(){
				System.out.println("view some thing");
			}
		};
		u2.view();
		u2.innerFun();
		
		ShowSomeThing s1 = new ShowSomeThing() {
			
			@Override
			public void show() {
				// TODO Auto-generated method stub
				System.out.println("view some interface");
			}
		};
		s1.show();
		
		//第3条
		singlton sing = singlton.getInstance();
		singlton sing2 = singlton.getInstance();
		System.out.println(sing.hashCode());
		System.out.println(sing2.hashCode());
		
		utillity ueq1 = new utillity();
		ueq1.setName("bruce");
		utillity ueq2 = new utillity();
		ueq2.setName("bruce");
		System.out.println(ueq1.toString());
		System.out.println(ueq1.equals(ueq2));
		
		
		
	}
	
	static void sum(int... args){
		int sum = 0;
		for(int s : args){
			sum += s;
		}
		System.out.println(sum);
	}
}
