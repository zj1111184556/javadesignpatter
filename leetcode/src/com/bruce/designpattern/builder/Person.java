package com.bruce.designpattern.builder;

public class Person {
	public String Head;
	public String Hand;
	public String Body;
	public String Feet;
	public String getHead() {
		return Head;
	}
	public void setHead(String head) {
		Head = head;
	}
	public String getHand() {
		return Hand;
	}
	public void setHand(String hand) {
		Hand = hand;
	}
	public String getBody() {
		return Body;
	}
	public void setBody(String body) {
		Body = body;
	}
	public String getFeet() {
		return Feet;
	}
	public void setFeet(String feet) {
		Feet = feet;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.Head + this.Hand + this.Body + this.Feet;
	}
	
	
}
