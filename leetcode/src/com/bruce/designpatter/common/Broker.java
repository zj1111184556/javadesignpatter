package com.bruce.designpatter.common;

import java.util.ArrayList;
import java.util.List;

public class Broker {
	private List<Order> listO = new ArrayList<Order>();
	
	public void  addOder(Order order){
		listO.add(order);
	}
	
	public void placeOrders(){
		for(Order r : listO){
			r.exec();
		}
		listO.clear();
	}
}
