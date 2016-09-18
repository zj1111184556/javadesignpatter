package com.bruce.designpatter.strategy;

public class Strategy {
	private SenderContent sender;
	public Strategy(SenderContent sender){
		this.sender = sender;
	}
	
	public void senderContent(){
		sender.sender();
	}
}
