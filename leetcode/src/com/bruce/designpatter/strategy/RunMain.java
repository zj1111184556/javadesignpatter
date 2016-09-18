package com.bruce.designpatter.strategy;

public class RunMain {
	public static void main(String[] args){
		SenderContent sc = new SenderMail();
		Strategy st = new Strategy(sc);
		st.senderContent();
		
		
		SenderContent scS = new SenderSMS();
		Strategy stS = new Strategy(scS);
		stS.senderContent();
	}
}
