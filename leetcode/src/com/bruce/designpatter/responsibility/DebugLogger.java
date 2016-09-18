package com.bruce.designpatter.responsibility;

public class DebugLogger extends AbstractLogger {
	public DebugLogger(int level){
		this.level = level;
	}
	@Override
	protected void write(String message) {
		// TODO Auto-generated method stub
		System.out.println("debug:" + message);
	}

}
