package com.bruce.designpatter.observer;

public class RunMain {
	public static void main(String[] args){
		BroadCast sub = new BroadCast();
		RD rd = new RD(sub);
		
		QT qt = new QT(sub);
		sub.register(rd);
		sub.register(qt);
		sub.setMessage(" Boss  来了！");
		sub.notifyObserver();
	}
}
