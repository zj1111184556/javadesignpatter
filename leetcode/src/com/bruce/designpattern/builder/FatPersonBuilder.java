package com.bruce.designpattern.builder;

public class FatPersonBuilder implements Builder {
	private Person person;
	public FatPersonBuilder(){
		this.person = new  Person();
	}
	@Override
	public void buildHead() {
		// TODO Auto-generated method stub
		person.setHead("big head");
	}

	@Override
	public void buildHand() {
		// TODO Auto-generated method stub
		person.setHand("big hand");
	}

	@Override
	public void buildBody() {
		// TODO Auto-generated method stub
		person.setBody("big body");
	}

	@Override
	public void BuildFeet() {
		// TODO Auto-generated method stub
		person.setFeet("big feet");
	}

	@Override
	public Person getPerson() {
		// TODO Auto-generated method stub
		return this.person;
	}

}
