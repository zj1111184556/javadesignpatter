package com.bruce.designpatter.responsibility;

public class InfoLogger extends AbstractLogger{
	
	public InfoLogger(int level){
		this.level = level;
	}
	@Override
	protected void write(String message) {
		// TODO Auto-generated method stub
		System.out.println("info:" + message);
	}

}
