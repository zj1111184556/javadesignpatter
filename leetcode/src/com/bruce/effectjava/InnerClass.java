package com.bruce.effectjava;

public class InnerClass {
	private final int fInt;
	public static void main(String[] args){
		InnerClass ic = new InnerClass();
		StaticInnerClass sc = new StaticInnerClass();
		ic = null;
		assert ic != null;
		System.out.println(sc.twoA);
	}
	
	private int a = 0;
	public InnerClass(){
		fInt = 0;
	}
	
	public class InnerOne{
		private int OneA = 0;
	}
	
	public static class StaticInnerClass{
		public int twoA = 2;
	}
}
