package com.bruce.designpatter.decorator;

public class ManagerAsus extends Manager {
	
	public ManagerAsus(Project coder) {
		super(coder);
		// TODO Auto-generated constructor stub
	}
	
	public void Before(){
		System.out.println("杭州方面开会讨论方案");
	}
	
	public void End(){
		System.out.println("提交测试");
	}

}
