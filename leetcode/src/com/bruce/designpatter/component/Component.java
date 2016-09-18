package com.bruce.designpatter.component;

public abstract class Component {
	public String name;
	public Component(String name){
		this.name = name;
	}
	public abstract void add(Component in );
	public abstract void remove(Component out );
	public abstract void display();
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
