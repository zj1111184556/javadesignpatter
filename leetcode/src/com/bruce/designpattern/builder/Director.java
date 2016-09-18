package com.bruce.designpattern.builder;

public class Director {
	public Director(){
	}
	
	public void Construct(Builder builder){
		builder.buildHead();
		builder.buildHand();
		builder.buildBody();
		builder.BuildFeet();
	}
}
