package com.bruce.designpatter.decorator;

public class MainTest {
	public static void main(String[] args){
		Project coder = new Coder();
		Manager asuser = new ManagerAsus(coder);
		asuser.Coding();
	}
}
