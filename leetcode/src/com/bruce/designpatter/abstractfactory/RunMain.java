package com.bruce.designpatter.abstractfactory;

public class RunMain {
	public static void main(String[] args){
		// 如果要增加发送微信的话 只需要 扩展 接口即可  
		// WeChatFactory  SenderWeChat
		IFactory fa = new MailFactory();
		SenderContent sender = fa.getSender();
		sender.sender();
		
		IFactory faS = new SMSFactory();
		SenderContent sender2 = faS.getSender();
		sender2.sender();
	}
}
