package com.bruce.designpattern.builder;

public class SmallPersonBuilder implements Builder {
	private Person person;
	public SmallPersonBuilder(){
		this.person = new  Person();
	}
	@Override
	public void buildHead() {
		// TODO Auto-generated method stub
		person.setHead("small head");
	}

	@Override
	public void buildHand() {
		// TODO Auto-generated method stub
		person.setHand("small hand");
	}

	@Override
	public void buildBody() {
		// TODO Auto-generated method stub
		person.setBody("small body");
	}

	@Override
	public void BuildFeet() {
		// TODO Auto-generated method stub
		person.setFeet("small feet");
	}

	@Override
	public Person getPerson() {
		// TODO Auto-generated method stub
		return this.person;
	}
}
