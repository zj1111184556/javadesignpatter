package com.bruce.effectjava;

public class singlton {
	public static singlton INSTANCE = null;
	public static Object lock = new Object();
	private singlton(){
		
	}
	public static singlton getInstance(){
		if (INSTANCE == null){
			synchronized (lock) {
				if (INSTANCE == null){
					INSTANCE = new singlton();
				}
			}
		}
		return INSTANCE;
	}
}
