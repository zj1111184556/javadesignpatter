package com.bruce.designpatter.decorator;

public class Manager implements Project {
	private Project coder;
	public Manager(Project coder){
		this.coder = coder;
	}
	@Override
	public void Coding() {
		// TODO Auto-generated method stub
		Before();
		coder.Coding();
		End();
	}
	public void Before(){
		
	}
	
	public void End(){
		
	}

}
