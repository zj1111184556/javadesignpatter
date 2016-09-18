package com.bruce.designpatter.observer;

public class RD implements Observer {
	private BroadCast sub;
	
	public RD(BroadCast sub){
		this.sub = sub;
	}
	
	
	@Override
	public void update() {
		// TODO Auto-generated method stub
		System.out.println(sub.getMessage() +  ", 好好工作！");
	}

}
