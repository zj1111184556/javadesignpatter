package com.bruce.designpatter.factory;

public class RunMain {
	public static void main(String[] args){
		Factory fa = new Factory();
		//简单工厂
		SenderContent sender = fa.getSender(Factory.SenderType.MAIL);
		sender.sender();
		
		//工厂
		SenderContent sender2 = fa.getSMS();
		sender2.sender();
	}
}
