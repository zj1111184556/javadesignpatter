package com.bruce.designpatter.facade;

public class FacadeClass {
	private final SubOne one = new SubOne();
	private final SubTwo two = new SubTwo();
	private final SubThree three = new SubThree();
	
	public FacadeClass(){
		
	}
	
	public void MethodA(){
		one.methodOne();
	}
	
	public void MethodB(){
		two.methodTwo();
		three.methodThree();
	}
	
}
