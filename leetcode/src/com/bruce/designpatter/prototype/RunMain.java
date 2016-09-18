package com.bruce.designpatter.prototype;

public class RunMain {
	public static void main(String[] args) throws CloneNotSupportedException{
		ConcretePrototype cp = new ConcretePrototype(); 
        for(int i=0; i< 10; i++){ 
            ConcretePrototype clonecp = (ConcretePrototype)cp.clone(); 
            clonecp.show(); 
        } 
	}
}
