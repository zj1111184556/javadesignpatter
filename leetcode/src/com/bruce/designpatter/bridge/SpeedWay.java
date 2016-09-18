package com.bruce.designpatter.bridge;

public class SpeedWay extends AbsractRoad {

	@Override
	void run() {
		// TODO Auto-generated method stub
		super.run();
		car.run();
		System.out.println("在高速公路行驶");
	}
	
}
