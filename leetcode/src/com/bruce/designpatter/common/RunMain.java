package com.bruce.designpatter.common;

public class RunMain {
	public static void main(String[] args){
		//		命令模式
		//
		//		命令模式（Command Pattern）是一种数据驱动的设计模式，它属于行为型模式。请求以命令的形式包裹在对象中，并传给调用对象。
		//		调用对象寻找可以处理该命令的合适的对象，并把该命令传给相应的对象，该对象执行命令。
		
		Stock stock = new Stock();
		BuyOrder buy = new BuyOrder(stock);
		SellOrder sell = new SellOrder(stock);
		
		Broker broker = new Broker();
		broker.addOder(buy);
		broker.addOder(sell);
		
		broker.placeOrders();
		
	}
}
