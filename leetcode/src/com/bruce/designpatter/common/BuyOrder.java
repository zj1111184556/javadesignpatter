package com.bruce.designpatter.common;

public class BuyOrder implements Order {
	private Stock  abcStock ;
	
	public BuyOrder(Stock stock){
		this.abcStock = stock;
	}
	
	
	@Override
	public void exec() {
		// TODO Auto-generated method stub
		abcStock.buy();
	}
}
