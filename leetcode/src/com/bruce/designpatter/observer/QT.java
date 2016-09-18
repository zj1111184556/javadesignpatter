package com.bruce.designpatter.observer;

public class QT implements Observer {

	private BroadCast sub;
	
	public QT(BroadCast sub){
		this.sub = sub;
	}
	
	@Override
	public void update() {
		// TODO Auto-generated method stub
		System.out.println(sub.getMessage() +  ", 好好测试！");
	}

}
