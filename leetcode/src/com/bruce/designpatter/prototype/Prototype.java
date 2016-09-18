package com.bruce.designpatter.prototype;

public class Prototype implements Cloneable {
	public Object clone() throws CloneNotSupportedException{
		Prototype proto = (Prototype) super.clone();
		return proto;
	}
}
