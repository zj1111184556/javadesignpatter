package com.bruce.designpatter.abstractfactory;

public class SMSFactory implements IFactory {

	@Override
	public SenderContent getSender() {
		// TODO Auto-generated method stub
		return new SenderSMS();
	}

	
	
}	
