package com.bruce.designpatter.observer;

import java.util.ArrayList;
import java.util.List;

public class BroadCast implements Subject {

	private List<Observer> listO = new ArrayList<Observer>();
	
	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public void register(Observer observer) {
		// TODO Auto-generated method stub
		listO.add(observer);
	}

	@Override
	public void unregister(Observer observer) {
		// TODO Auto-generated method stub
		listO.remove(observer);
	}

	@Override
	public void notifyObserver() {
		// TODO Auto-generated method stub
		for (Observer o : listO){
			o.update();
		}
	}
	

}
