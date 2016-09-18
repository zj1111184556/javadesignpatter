package com.bruce.designpattern.builder;

public interface Builder {
	void buildHead();
	void buildHand();
	void buildBody();
	void BuildFeet();
	Person getPerson();
}
