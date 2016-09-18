package com.bruce.designpatter.factory;

public class Factory {
	public enum SenderType{
		MAIL, SMS
	}
	
	public SenderContent getSender(SenderType type){
		switch(type){
			case MAIL:
				return new SenderMail();
			case SMS:
				return new SenderSMS();
			default:
				return new SenderMail();
		}
	}
	
	public SenderContent getMail(){
		return new SenderMail();
	}
	
	public SenderContent getSMS(){
		return new SenderSMS();
	}
}	
