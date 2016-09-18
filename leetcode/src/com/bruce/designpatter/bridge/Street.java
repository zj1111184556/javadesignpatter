package com.bruce.designpatter.bridge;

public class Street extends AbsractRoad {

	@Override
	void run() {
		// TODO Auto-generated method stub
		super.run();
		car.run();
		System.out.println("在市区道路行驶");
	}

	
}
