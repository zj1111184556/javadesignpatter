package com.bruce.designpatter.adapter;

public class RunMain {
	public static void main(String[] args){
		
		// 类适配器
		Target t = new NormalReauest();
		t.request();
		
		Target t2 = new Adapter();
		t2.request();
		
		//对象适配器
		Target t3 = new ObjectAdapter();
		t3.request();
	}
}
