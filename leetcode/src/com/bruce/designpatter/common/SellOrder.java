package com.bruce.designpatter.common;

public class SellOrder implements Order {
	private Stock  abcStock ;
	
	public SellOrder(Stock stock){
		this.abcStock = stock;
	}
	
	
	@Override
	public void exec() {
		// TODO Auto-generated method stub
		abcStock.sell();
	}

}
