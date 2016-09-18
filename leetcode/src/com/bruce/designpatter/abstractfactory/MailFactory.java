package com.bruce.designpatter.abstractfactory;

public class MailFactory implements IFactory {

	@Override
	public SenderContent getSender() {
		// TODO Auto-generated method stub
		return new SenderMail();
	}

}
