package com.bruce.designpatter.adapter;

/***
 * 对象适配器
 * @author jiezhou
 *
 */
public class ObjectAdapter implements Target {
	Adaptee adaptee = new Adaptee();
	@Override
	public void request() {
		// TODO Auto-generated method stub
		adaptee.SpecificRequest();
	}

}
